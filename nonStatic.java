package helloworld;

public class nonStatic {
	private int a=10;
	public class inner {
		int a=1;
		public void run() {
			System.out.println(a);
			System.out.println(this.a);
		    System.out.println(nonStatic.this.a); } }
	public static void main(String[] args) {
		nonStatic n=new nonStatic();
		nonStatic.inner inner=n.new inner();
		inner.run(); } }
