package maceraoyunu;

import java.util.Scanner;

public class toolStore extends normalLocation {
    Scanner scan=new Scanner(System.in);
	toolStore(player player) {
		super(player, "Mağaza"); }
	public boolean getLocation() {
		System.out.println("Para: " + player.getMoney());
		System.out.println("1.Silahlar\n2.Zırhlar\n3.Çıkış");
		int selTool=scan.nextInt();
		int SelectItemId;
		switch(selTool) {
		case 1: SelectItemId=weaponMenu();
		        buyWeapon(SelectItemId);
		        break;
		case 2: SelectItemId=armorMenu();
			    buyArmor(SelectItemId);
		        break;
		default: break; }
		return true; }
	public int armorMenu() {
	    System.out.println("1.Hafif --> Para: 15 - Hasar: 1");
	    System.out.println("2.Orta --> Para: 25 - Hasar: 3");
	    System.out.println("3.Ağır --> Para: 40 - Hasar: 5");
	    System.out.println("4.Çıkış"); 
	    System.out.println("Silah Seçiniz: ");
	    int selectArmorID=scan.nextInt();
	    return selectArmorID; }
	public void buyArmor(int itemID) {
	        int avoid=0,price=0;
	        String armor=null;
	        switch(itemID) {
	        case 1: avoid=1;
	                armor="Hafif Zırh";
	                price=15;
	                break;
	        case 2: avoid=3;
	                armor="Orta Zırh";
                    price=25;
                    break;
	        case 3: avoid=5;
	                armor="Ağır Zırh";
                    price=40;
                    break;
	        case 4: System.out.println("Çıkış Yapılıyor."); break;
            default: System.out.println("Geçersiz İşlem."); }
	        if(price > 0) {
	        if(player.getMoney()>price) {
	            player.getInventory().setAvoid(avoid);
	            player.getInventory().setArmorName(armor);
	            player.setMoney(player.getMoney()-price);
	            System.out.println(armor + " satın aldınız. Engellenen hasar: " + player.getInventory().getAvoid());
	            System.out.println("Kalan para: " + player.getMoney()); } }     
	        else {
	        	System.out.println("Bakiyeniz Yetersiz."); }
	}
	public int weaponMenu() {
	    System.out.println("1.Tabanca --> Para: 25 - Hasar: 2");
	    System.out.println("2.Kılıç --> Para: 35 - Hasar: 3");
	    System.out.println("3.Tüfek --> Para: 45 - Hasar: 7");
	    System.out.println("4.Çıkış"); 
	    System.out.println("Silah Seçiniz: ");
	    int selectWeaponID=scan.nextInt();
	    return selectWeaponID; }
	public void buyWeapon(int itemID) {
	        int damage=0,price=0;
	        String weapon=null;
	        switch(itemID) {
	        case 1: damage=2;
	                weapon="Tabanca";
	                price=25;
	                break;
	        case 2: damage=3;
                    weapon="Kılıç";
                    price=35;
                    break;
	        case 3: damage=7;
                    weapon="Tüfek";
                    price=45;
                    break;
	        case 4: System.out.println("Çıkış Yapılıyor."); break;
            default: System.out.println("Geçersiz İşlem."); }
	        if(price > 0) {
	        if(player.getMoney()>price) {
	            player.getInventory().setDamage(damage);
	            player.getInventory().setWeapon(weapon);
	            player.setMoney(player.getMoney()-price);
	            System.out.println(weapon + " satın aldınız. Önceki hasar: " + player.getDamage() + " Yeni hasar: " + player.getTotalDamage());
	            System.out.println("Kalan para: " + player.getMoney()); } }     
	        else {
	        	System.out.println("Bakiyeniz Yetersiz."); }
	}
}
