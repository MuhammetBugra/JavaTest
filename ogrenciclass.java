package helloworld;

public class ogrenciclass {
	public static void main(String[] args) {
	System.out.println("Online Ogrenci: " + ogrenci.howstudent());
	ogrenci s1=new ogrenci("Ali",220,100);
	ogrenci s2=new ogrenci("Veli",320,80);
	int[] dizi=new int[2];
	dizi[0]=s1.point;
	dizi[1]=s2.point;
	System.out.println("Online Ogrenci: " + ogrenci.howstudent());
	System.out.println("Puan Ort: " + ogrenci.pointcalc(dizi)); } }
