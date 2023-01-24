package League;

public class LeagueInformation { // this is class name
	protected String name,nickname,establishmentYear; // create string values
	public LeagueInformation(String name, String nickname, String establishmentYear) { //this is constructor method
		this.name=name; // set the values
		this.nickname=nickname;
		this.establishmentYear=establishmentYear; } // end of the constructor method
	public String getName() { // you can return name values
		return name; } // end of the get method
	public void setName(String name) { // you can set name values
		this.name=name; } // end of the set method
	public String getNickname() {
		return nickname; }
	public void setNickname(String nickname) {
		this.nickname=nickname; }
	public String getEstablishmentYear() {
		return establishmentYear; }
	public void setEstablishmentYear(String establishmentYear) {
		this.establishmentYear=establishmentYear; }
	public String toString() {
		return name+nickname; } }