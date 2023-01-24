package maceraoyunu;

public abstract class location {
	protected player player;
	protected String name;
	location(player player) {
		this.player=player; }
	public abstract boolean getLocation();
	public player getPlayer() {
		return player; }
	public void setPlayer(player player) {
		this.player = player; }
	public String getName() {
		return name; }
	public void setName(String name) {
		this.name = name; }
}
