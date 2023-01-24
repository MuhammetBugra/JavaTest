package helloworld;

import java.util.Scanner;

public class IkiSekiz {
	public static void main(String[]args) {
		int sayi=7,n;
		Scanner scan=new Scanner(System.in);
		System.out.print("seçim: ");
		n=scan.nextInt();
		switch (n) {
		case 1: System.out.println("sonuc: "+ikitosekiz(sayi)); break;
		case 2: System.out.println("sonuc: "+sekiztoiki(sayi)); break; } }
	public static int ikitosekiz(int sayi) {
		int onluk=0,sonuc=0,ust=1;
		while(sayi>0) {
			onluk+=(sayi%10)*ust;
			sayi/=10;
			ust*=2; }
		ust=1;
		while(onluk>0) {
			sonuc+=ust*(onluk%8);
			onluk/=8;
			ust*=10; }
		return sonuc; }
    public static int sekiztoiki(int sayi) {
    	int onluk=0,sonuc=0,ust=1;
		while(sayi>0) {
			onluk+=(sayi%10)*ust;
			sayi/=10;
			ust*=8; }
		ust=1;
		while(onluk>0) {
			sonuc+=ust*(onluk%2);
			onluk/=2;
			ust*=10; }
		return sonuc; } }
