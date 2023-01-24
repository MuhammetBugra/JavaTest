package okul;

public class memurlar extends calisan {
	String departman,mesai;
	public memurlar(String ad, String soyad, String telefon, String departman, String mesai) {
	super(ad, soyad, telefon);
	this.departman = departman;
	this.mesai = mesai; }
	public void calis() {
	System.out.println("Derse girildi."); }
}
