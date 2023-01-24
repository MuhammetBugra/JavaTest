package helloworld;

import java.util.Scanner;

public class RecursiveAsal {
	public static void main(String[]args) {
		int sayi;
		Scanner scan=new Scanner(System.in);
		System.out.print("Sayı: ");
		sayi=scan.nextInt();
		System.out.println(isAsal(sayi,2));
		scan.close(); }
	public static boolean isAsal(int sayi,int i) {
		if(i==sayi) 
			return true;
		else if(sayi%i==0)
			return false;
		else
			return isAsal(sayi,++i);
} }
