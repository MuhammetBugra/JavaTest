package helloworld;

import java.util.Scanner;

public class ucakbileti {
	public static void main(String[]args) {
	int km,yas,tip; double fiyat;
	Scanner scan = new Scanner(System.in);
	System.out.print("Mesafe: ");
	km=scan.nextInt();
	System.out.print("Yaş: ");
	yas=scan.nextInt();
	System.out.print("1-) Tek Bilet -- 2-) Gidiş-Dönüş \nTür: ");
	tip=scan.nextInt();
	fiyat=0.1*km;
	if(yas<=12) {
	fiyat=0.5*fiyat; }
	else if(yas>12 && yas<=24) {
	fiyat=0.9*fiyat; }
	else if(yas>65) {
	fiyat=0.7*fiyat; }
	if(tip==2) {
	fiyat=fiyat*2*0.8; }
	System.out.print("Toplam Fiyat: " + fiyat); } }