package helloworld;

import java.util.Scanner;

public class ebobekok {
	public static void main(String[]args) {
	int sayi,sayi1,ebob=1,ekok,a=0;
	Scanner scan=new Scanner(System.in);
	sayi=scan.nextInt();
	sayi1=scan.nextInt();
	ekok=sayi*sayi1;
	int min=(sayi<sayi1) ? sayi : sayi1;
	for(int i=1;i<=min;i++) {
	    if(sayi%i==0 && sayi1%i==0) {
	    	for(int j=i-1;j>=2;j--) {
	    		if(i%j==0) {
	    			a=1; break; } }
	        ebob=i;
	    if(a==0) {
		    ekok/=i; } } }
	System.out.print("ebob: " + ebob + "\nekok: " + ekok); } }