package helloworld;

public class Anonim {
	public void run() {
		System.out.println("Anonim sınıfı."); }
	public static void main(String[] args) {
		Anonim a=new Anonim() {
		    public void run() {
		    	System.out.println("Anonim"); } };
		    	a.run(); } }
