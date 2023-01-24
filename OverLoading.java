package helloworld;

public class OverLoading { 
	public static int sayi=0; 
	int sayi1=0;
	public static void sinif(int sayi1) {
		System.out.println(sayi1); }
	public static void sinif() {
		System.out.println(sayi); }
	public static void sinif(int sayi1,int sayi2) {
		System.out.println(sayi1+sayi2); }
	public void sinif1() {
		System.out.println(++sayi1); }
	public static void main(String[] args) {
		OverLoading o=new OverLoading();
		o.sinif(++sayi);
		o.sinif1();
		o.sinif1();
		OverLoading o1=new OverLoading();
		o1.sinif(sayi, ++sayi);
		o1.sinif1();
		OverLoading o2=new OverLoading();
		o2.sinif();
		OverLoading o3=new OverLoading();
		o3.sinif(++sayi);
} }