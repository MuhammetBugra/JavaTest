package helloworld;

import java.util.Scanner;

public class kelimeTersi {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("kelime: ");
		String kelime=scan.nextLine();
		System.out.println(Tersi(kelime)); }
	public static String Tersi(String kelime) {
		if(kelime.isEmpty()) 
			return kelime;
		else
		    return Tersi(kelime.substring(1))+kelime.charAt(0); } }
