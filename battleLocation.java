package maceraoyunu;

import java.util.Scanner;

public abstract class battleLocation extends location {
    protected obstacle obstacle;
    protected String award;
    Scanner scan=new Scanner(System.in);
	battleLocation(player player, String name, obstacle obstacle,String award) {
		super(player);
		this.name=name;
		this.obstacle=obstacle;
		this.award=award; }
	public boolean getLocation() {
		int obstacleCount=obstacle.obstacleCount();
		System.out.println("Şuan buradasınız: "+this.getName()+". Dikkatli ol! Burada "+obstacleCount+" tane "+obstacle.getName()+" yaşıyor.");
		System.out.println("<S>avaş veya <K>aç");
		String selectCase=scan.next();
		selectCase=selectCase.toUpperCase();
		if(selectCase.equals("S")) {
		    if(combat(obstacleCount)) {
		        System.out.println(this.getName()+" Bölgesindeki tüm düşmanları temizlediniz.");
		        if(this.award.equals("Food") && player.getInventory().isFood()==false) {
		        	System.out.println(this.award+" kazandınız.");
		        	player.getInventory().setFood(true); }
		        else if(this.award.equals("Water") && player.getInventory().isWater()==false) {
		        	System.out.println(this.award+" kazandınız.");
		        	player.getInventory().setWater(true); }
		        else if(this.award.equals("Firewood") && player.getInventory().isFirewood()==false) {
		        	System.out.println(this.award+" kazandınız.");
		        	player.getInventory().setFirewood(true); }
		        return true; }
		     else if(player.getHealthy()<=0) {
		        System.out.println("Öldünüz.");
		        return false; } }
	        return true; }
	public boolean combat(int obsCount) {
		int defaultObstacleHealth=obstacle.getHealth();
		for(int i=0;i<obsCount;i++) {
		playerStats();
		enemyStats();
		while(player.getHealthy()>0 && obstacle.getHealth()>0) {
		    System.out.println("<V>ur veya <K>aç: ");
		    String selectCase=scan.next();
		    selectCase=selectCase.toUpperCase();
		    if(selectCase.equals("V")) {
		        System.out.println("Siz vurdunuz.");
		        obstacle.setHealth(obstacle.getHealth()-player.getTotalDamage());
		        afterHit();
		        if(obstacle.getHealth()>0) {
		            System.out.println("Canavar size vurdu.");
		            player.setHealthy(player.getHealthy()-(obstacle.getDamage()-player.getInventory().getAvoid()));
		            afterHit(); } }
		    else {
		    	return false; } }
		if(obstacle.getHealth()<player.getHealthy()) {
			System.out.println("Düşmanı yendiniz.");
			player.setMoney(player.getMoney()+obstacle.getAward());
			System.out.println("Güncel paranız: "+player.getMoney());
			obstacle.setHealth(defaultObstacleHealth); }
		else {
			return false; }
		}
	    return true; }
	public void afterHit() {
		System.out.println("Oyuncu canı: "+player.getHealthy()+" "+obstacle.getName()+" canı: "+obstacle.getHealth()); }
	public void playerStats() {
		System.out.println("Oyuncu Bilgileri: ");
		System.out.println("Can: "+player.getHealthy());
		System.out.println("Hasar: "+player.getTotalDamage());
		System.out.println("Para: "+player.getMoney());
		if(player.getInventory().getDamage()>0) {
		    System.out.println("Silah: "+player.getInventory().getWeapon()); }
		if(player.getInventory().getAvoid()>0) {
			System.out.println("Zırh: "+player.getInventory().getArmorName()); } }
    public void enemyStats() {
        System.out.println(obstacle.getName()+" Değerleri:");
        System.out.println("Can: "+obstacle.getHealth());
        System.out.println("Hasar: "+obstacle.getDamage());
        System.out.println("Ödül: "+obstacle.getAward()); }
}