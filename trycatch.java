package helloworld;

import java.util.Scanner;

public class trycatch {
	public static void main(String[] args) {
		System.out.println("Program başladı.");
		int a=0,b;
		Scanner scan=new Scanner(System.in);
		try {
			a=2/0; }
		catch (ArithmeticException e) {
			System.out.println(e.getMessage()); }
	    System.out.println(a);
	    System.out.println("Program bitti.");
	    int[] dizi=new int[3];
	    try {
	    	dizi[4]=10; }
	    catch(ArrayIndexOutOfBoundsException e) {
	    	System.out.println(e.getMessage()); }
	    try {
	    	System.out.println("sayı: ");
	    	b=scan.nextInt(); }
	    catch(Exception e) {
	    	System.out.println(e.getMessage()); }
	    finally {
	    	System.out.println("Finally çalıştı."); } } }
