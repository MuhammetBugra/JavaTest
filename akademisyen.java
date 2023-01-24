package okul;

public class akademisyen extends calisan {
	String bolum,gorevler,ders;
	public akademisyen(String ad, String soyad, String telefon, String bolum, String gorevler, String ders) {
	super(ad, soyad, telefon);
	this.bolum = bolum;
	this.gorevler = gorevler;
	this.ders = ders;}
	public void dersegir() {
	System.out.println("Derse girildi."); }
	public String giris() {
	return super.giris()+"A kapısından "; }
	public String getBolum() {
	return bolum; }
	public void setBolum(String bolum) {
	this.bolum = bolum; }
	public String getGorevler() {
	return gorevler; }
	public void setGorevler(String gorevler) {
    this.gorevler = gorevler; }
	public String getDers() {
	return ders; }
	public void setDers(String ders) {
	this.ders = ders; }
}
