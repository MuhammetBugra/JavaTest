package helloworld;

public class threading {
	public static void main(String[] args) {
		Islemler i1=new Islemler("İlk");
		i1.run();
		Thread t1=new Thread(i1);
		Islemler i2=new Islemler("İki");
		i2.run();
		Thread t2=new Thread(i2);
		t1.start();
		t2.start(); } }
