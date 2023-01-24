package okul;

public class main {
	public static void main(String[] args) {
	akademisyen a=new akademisyen("Ahmet","Metin","555000","Ceng","hoca","ceng101");
	System.out.println(a.getAd());
	System.out.println(a.giris());
	calisan[] liste= {a};
	calisan.listele(liste);
} }
