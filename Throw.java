package helloworld;

public class Throw {
	public Throw find(String id) throws ThrowException {
		if(id.equals("123")) {
			return new Throw(); }
		else {
			throw new ThrowException("Öğrenci bulunamadı."); } }
	  public static void main(String[] args) {
		int a=0;
		if(a==0) {
		System.out.println("Bölen 0'a eşit olamaz.");
		throw new ArithmeticException("Exception"); }
		System.out.println("Kodun devamı."); }
}
