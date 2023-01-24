package helloworld;

import java.util.Scanner;

public class SayininTersi {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Sayı: ");
		int sayi=scan.nextInt();
		System.out.println(Tersi(sayi,0)); }
	public static int Tersi(int sayi,int ters) {
		ters=ters*10+sayi%10;
	    System.out.println(ters);
		if(sayi<10)
			return sayi;
		else 
		    return Tersi(sayi/10,ters); } }
