package helloworld;

public class fibonacci {
	public static void main(String[]args) {
	int n=5,a=0,b=1,c=1;
	System.out.print(a + " " + b + " " + c);
	for(int i=0;i<n;i++) {
	a=b;
	b=c;
	c=a+b;
	System.out.print(" "+ c); } } }
