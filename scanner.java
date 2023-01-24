package helloworld;
import java.util.Scanner;
public class scanner {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
    int a;	
    System.out.println("A:");
    a=input.nextInt();
    System.out.println("a: " + a);
    String b;
    b=input.nextLine();
    System.out.print("b: " + b);; } }