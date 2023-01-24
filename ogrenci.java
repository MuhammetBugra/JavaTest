package helloworld;

public class ogrenci {
	public String name;
	public int id,point;
	private static int counter=0;
	ogrenci(String name, int id, int point) {
	this.name=name;
	this.id=id;
	this.point=point;
	ogrenci.counter++; }
	public void exit() {
	ogrenci.counter--; }
    public static int howstudent() {
    return ogrenci.counter; }
    public static double pointcalc(int[] dizi) {
    double ort=0;
    for(int i=0;i<dizi.length;i++) {
    ort+=dizi[i]; }
    return ort/dizi.length; } }