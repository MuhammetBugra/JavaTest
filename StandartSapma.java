package helloworld;

public class StandartSapma {
	public static void main(String[]args) {
		int[] dizi={ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double stSapma=hesapla(dizi);
		System.out.println("Sayilar: ");
		for(int sayi:dizi) {
			System.out.print(sayi+" "); }
		System.out.format("\nStandart Sapma: %.6f", stSapma); }
	public static double hesapla(int[] dizi) {
		double toplam=0.0,StSapma=0.0;
		for(int sayi:dizi) {
			toplam+=sayi; }
		double ortalama=toplam/dizi.length;
		for(int sayi:dizi) {
			StSapma+=Math.pow(sayi-ortalama, 2); }
		return Math.sqrt(StSapma/dizi.length); } }