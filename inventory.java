package maceraoyunu;

public class inventory {
	private boolean water,food,firewood;
	private String weapon,armorName;
	private int damage,avoid;
	public inventory() {
	    this.water=false;
	    this.food=false;
	    this.firewood=false;
	    this.damage=0;
	    this.avoid=0;
	    this.weapon=null;
	    this.armorName=null; }
	public boolean isWater() {
		return water; }
	public void setWater(boolean water) {
		this.water = water; }
	public boolean isFood() {
		return food; }
	public void setFood(boolean food) {
		this.food = food; }
	public boolean isFirewood() {
		return firewood; }
	public void setFirewood(boolean firewood) {
		this.firewood = firewood; }
	public String getWeapon() {
		return weapon; }
	public void setWeapon(String weapon) {
		this.weapon = weapon; }
	public String getArmorName() {
		return armorName; }
	public void setArmorName(String armorName) {
		this.armorName = armorName; }
	public int getDamage() {
		return damage; }
	public void setDamage(int damage) {
		this.damage = damage; }
	public int getAvoid() {
		return avoid; }
	public void setAvoid(int avoid) {
		this.avoid = avoid; }
}
