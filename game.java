package maceraoyunu;

import java.util.Scanner;

public class game {
	player player;
	location location;
	Scanner scan=new Scanner(System.in);
    public void login() {
    	System.out.println("macera oyununa hoşgeldiniz...");
    	System.out.println("İsminiz: ");
    	String playerName=scan.nextLine();
    	player=new player(playerName);
    	player.selectChar();
    	start(); }
    public void start() {
    	while(true) {
            System.out.println("1-) Güvenli ev --> Size ait güvenli mekan.");
            System.out.println("2-) Mağara --> Zombi çıkabilir.");
            System.out.println("3-) Orman --> Vampir çıkabilir.");
            System.out.println("4-) Nehir --> Ayı çıkabilir.");
            System.out.println("5-) Mağaza --> Silah veya Zırh alabilirsiniz.");
            System.out.println("\nYer Seçin: ");
            int selectLocation=scan.nextInt();
            while(selectLocation < 0 || selectLocation > 5) {
                System.out.println("Lütfen geçerli bir yer seçiniz: ");
                selectLocation=scan.nextInt(); }
            switch(selectLocation) {
                case 1: location=new safeHouse(player); break;
                case 2: location=new cave(player); break;
                case 3: location=new forest(player); break;
                case 4: location=new river(player); break;
                case 5: location=new toolStore(player); break; }
            if(location.getClass().getName().equals("Safe House")) {
                if(player.getInventory().isFirewood() && player.getInventory().isFood() && player.getInventory().isWater()) {
                	System.out.println("Tebrikler oyunu kazandınız."); } }
            if(!location.getLocation()) {
            System.out.println("Oyun bitti.");
            break; } } } }
