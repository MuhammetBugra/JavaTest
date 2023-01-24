package okul;

public class asistan extends akademisyen {
	String yukseklisans;
	public asistan(String ad, String soyad, String telefon, String bolum, String gorevler, String ders, String yukseklisans) {
	super(ad, soyad, telefon, bolum, gorevler, ders);
	this.yukseklisans = yukseklisans; }
	public String getYukseklisans() {
	return yukseklisans; }
	public void setYukseklisans(String yukseklisans) {
	this.yukseklisans = yukseklisans; }
}
