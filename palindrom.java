package helloworld;

import java.util.Scanner;

public class palindrom {
	static boolean isPalindrom(int input,String kelime) {
	int tmp=input,sayi=0,kalan; 
	String tmp1="";
	for(int i=kelime.length()-1;i>=0;i--) {
	tmp1+=kelime.charAt(i); }
	while(tmp!=0) {
	kalan=tmp%10;
	sayi=sayi*10+kalan;
	tmp/=10; }
	if(input==sayi && kelime.equals(kelime)) {
	return true; }
	else {
	return false; } }
	public static void main(String[]args) {
	int input;
	String kelime="kelek";
	Scanner scan = new Scanner(System.in);
	input=scan.nextInt();
	System.out.print("sonuc: " + isPalindrom(input,kelime));
} }
