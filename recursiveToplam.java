package helloworld;

import java.util.Scanner;

public class recursiveToplam {
	public static int recPlus(int a) {
		if(a<1) 
			return 1;
		else 
			return a*recPlus(a-1); }
	public static void main(String[]args) {
		int a;
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		System.out.println(recPlus(a));	 } }
