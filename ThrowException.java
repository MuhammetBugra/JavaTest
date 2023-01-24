package helloworld;

public class ThrowException extends Exception {
	public ThrowException(String msg) {
		super(msg); } 
	public static void main(String[] args) throws ThrowException {
		Throw t=new Throw();
		Throw t1=t.find("12"); } }
