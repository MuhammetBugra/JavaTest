package maceraoyunu;

import java.util.Scanner;

public class player {
	private int damage,healthy,money,realHealthy;
	private String name,cName;
	private inventory inventory;
	Scanner scan=new Scanner(System.in);
	public player(String name) {
	    this.name = name;
	    this.inventory=new inventory(); }
	public void selectChar() {
	    switch(charMenu()) {
	        case 1:initPlayer("Samuray", 5, 21, 15); break;
	        case 2:initPlayer("Okçu",7,18,20); break;
	        case 3:initPlayer("Şovalye",8,24,5); break; }
	    System.out.println("Karakter: " + getcName() + "\tHasar: " + getDamage() + "\tSağlık: " + getHealthy() + "\tPara: " + getMoney()); }
	public int charMenu() {
	   System.out.println("Lütfen bir karakter seçiniz: ");
	   System.out.println("1-) Samuray \t Hasar: 5 \t Sağlık: 21 \t Para: 15");
	   System.out.println("2-) Okçu \t Hasar: 7 \t Sağlık: 18 \t Para: 20");
	   System.out.println("3-) Şovalye \t Hasar: 8 \t Sağlık: 24 \t Para: 5");
       System.out.println("Seçiminiz: ");
	   int charId=scan.nextInt();
	   while(charId<1 || charId >3) {
	       System.out.println("Geçerli karakter seçiniz:");
	       charId=scan.nextInt(); }
	   return charId; }
	public int getTotalDamage() {
	    return this.getDamage()+this.getInventory().getDamage();
	}
	public void initPlayer(String cName, int damage, int healthy, int money) {
		setcName(cName);
		setDamage(damage);
        setHealthy(healthy);
        setMoney(money);
        setRealHealthy(healthy); }
	public int getDamage() {
		return damage; }
	public void setDamage(int damage) {
		this.damage = damage; }
	public int getHealthy() {
		return healthy; }
	public void setHealthy(int healthy) {
		this.healthy = healthy; }
	public int getMoney() {
		return money; }
	public void setMoney(int money) {
		this.money = money; }
	public String getName() {
		return name; }
	public void setName(String name) {
		this.name = name; }
	public String getcName() {
		return cName; }
	public void setcName(String cName) {
		this.cName = cName; }
	public inventory getInventory() {
		return inventory; }
	public void setInventory(inventory inventory) {
		this.inventory = inventory; }
	public int getRealHealthy() {
		return realHealthy; }
	public void setRealHealthy(int realHealthy) {
		this.realHealthy = realHealthy; }
	
}
