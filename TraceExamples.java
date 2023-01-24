package helloworld;

public class TraceExamples {
	private static int i=0;
	public static void main(String args[]) {
		int i=0;
		TraceExamples1.Print(i);
		TraceExamples1 t1=new TraceExamples1();
		TraceExamples1 t2=new TraceExamples1();
		TraceExamples1 t3=new TraceExamples1();
		t1.Print(++i);
		t2.Print(++i);
		t3.Print(++i);
	    demo(); 
	    System.out.println(demo4()); }  
	private static void demo() { 
        i++;
	    demo1(); }  
	static void demo1() {
		i++;
	    demo2(); }  
	static void demo2() { 
		i++;
	    demo3(); }  
	static void demo3() {
		i++; TraceExamples1.Print(++i); }
	static int demo4() {
		int x=0;
		return ++x; } }  