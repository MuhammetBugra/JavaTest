package helloworld;

public class Static {
	private int a=10;
	private static int b=2;
	public static class inner {
		int a=1;
		public void run() {
			System.out.println(a);
			System.out.println(this.a);
		    System.out.println(b); } }
	public static void main(String[] args) {
		Static.inner s=new Static.inner();
		s.run(); } }
