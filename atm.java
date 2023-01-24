package helloworld;

import java.util.Scanner;

public class atm {
	public static void main(String[]args) {
	int bakiye=1000,input,miktar;
	System.out.print("Bakiye: " + bakiye + "TL");
	Scanner scan=new Scanner(System.in);
	while(bakiye>0) {
	System.out.println();
	System.out.println("1-) Para Yatır ");
	System.out.println("2-) Para Çek ");
	System.out.println("3-) Bakiye Sorgula ");
	System.out.println("4-) Çıkış Yap ");
	System.out.println("Yapmak İstediğiniz İşlemi Seçiniz: ");
	input=scan.nextInt();
	if(input==1) {
	System.out.print("Yatırmak İstediğiniz Miktar: ");
	miktar=scan.nextInt();
	bakiye+=miktar; }
	else if(input==2) {
    System.out.print("Çekmek İstediğiniz Miktar: ");
	miktar=scan.nextInt();
	bakiye-=miktar; }
	else if(input==3) {
	System.out.print("Bakiye: " + bakiye + "TL"); }
	else if(input==4) {
	System.out.print("Çıkış Yapılıyor...");
	break; }
	else {
	System.out.print("Geçersiz İşlem"); } } } }