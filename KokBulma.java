package helloworld;

import java.util.Scanner;

public class KokBulma {
	public static void main(String[]args) {
		int a,b,c;
		double x1,x2;
		Scanner scan=new Scanner(System.in);
		System.out.println("ax^2+bx+c");
		System.out.print("a değeri: ");
		a=scan.nextInt();
		System.out.print("b değeri: ");
		b=scan.nextInt();
		System.out.print("c değeri: ");
		c=scan.nextInt();
		String denklem=a+"x^2+"+b+"x+"+c;
		System.out.println(denklem);
		double disc=Math.sqrt(b*b-4*a*c);
		x1=(-b+disc)/(2*a);
		x2=(-b-disc)/(2*a);
		System.out.println("denklem kökleri: "+x1+" ve "+x2);
} }
