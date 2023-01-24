package okul;

public class calisan {
	protected String ad,soyad,telefon;
	public String giris() {
	return this.ad+this.soyad+" giriş yaptı."; }
	public calisan(String ad, String soyad, String telefon) {
	this.ad = ad;
	this.soyad = soyad;
	this.telefon = telefon; }
	public String getAd() {
	return ad; }
	public void setAd(String ad) {
	this.ad = ad; }
	public String getSoyad() {
	return soyad; }
	public void setSoyad(String soyad) {
	this.soyad = soyad; }
	public String getTelefon() {
	return telefon; }
	public void setTelefon(String telefon) {
	this.telefon = telefon; }
	public static void listele(calisan[] liste) {
	for(calisan c:liste) {
	System.out.println(c.giris()); }
	}
}
