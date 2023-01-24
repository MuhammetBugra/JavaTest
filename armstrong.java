package helloworld;

public class armstrong {
	public static void main(String[]args) {
	int sayi=120,sonuc = 0;
	while(sayi>0) {
	sonuc+=(sayi%10)*(sayi%10)*(sayi%10);
	sayi/=10;
	System.out.print("Sonuc: "+sonuc); } } }
