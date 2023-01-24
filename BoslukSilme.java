package helloworld;

import java.util.Scanner;

public class BoslukSilme {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Kelime Girin: ");
		String kelime=scan.nextLine();
		kelime=kelime.replaceAll("\\s","");
		System.out.println(kelime);
		scan.close();
} }
