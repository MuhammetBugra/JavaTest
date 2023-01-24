package helloworld;

import java.util.Scanner;

public class recursivefibonacci {
	static int fibo(int input) {
	if(input==1 || input==2)
	    return 1;
	else
	    return fibo(input-1)+fibo(input-2); }
	public static void main(String[]args) {
	int input;
	Scanner scan = new Scanner(System.in);
	input=scan.nextInt();
	System.out.print(fibo(input)); } }