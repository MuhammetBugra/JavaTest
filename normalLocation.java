package maceraoyunu;

public abstract class normalLocation extends location {

	normalLocation(player player, String name) {
		super(player);
		this.name=name; }
	public boolean getLocation() {
	    return true; }
}
