package helloworld;

import java.util.Scanner;

public class HarfSıklıgı {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Kelime Girin: ");
		String kelime=scan.nextLine();
		System.out.print("Harf Girin: ");
		char c=scan.next().charAt(0);
		int frequency=0;
		for(int i=0;i<kelime.length();i++) {
			if(c==kelime.charAt(i)) {
				frequency++; } }
		System.out.println("harf sıklığı: "+frequency);
} }
