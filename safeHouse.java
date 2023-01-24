package maceraoyunu;

public class safeHouse extends normalLocation {

	safeHouse(player player) {
		super(player, "Güvenli Ev"); }
	public boolean getLocation() {
	    player.setHealthy(player.getRealHealthy());
	    System.out.println("İyileştiniz.");
	    System.out.println("Şuan güvenli evdesiniz.");
	    return true; }

}
