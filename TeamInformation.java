package League;

public class TeamInformation extends LeagueInformation { // this class extends upper class
	protected String playerName,usingFoot; // create string values
	protected int playerNumber,age,height,weight; // create integer values
	public TeamInformation(String name,String nickname,String establishmentYear, String playerName,String usingFoot,int playerNumber,int age, int height, int weight) {
		// this is constructor method
		super(name,nickname,establishmentYear); //calling super class constructor
		this.playerName=playerName; // set the initial values
		this.usingFoot=usingFoot;
		this.playerNumber=playerNumber;
		this.age=age;
		this.height=height;
		this.weight=weight; } // end of the constructor method
	public String getPlayerName() { // you can return playername values
		return playerName; } // end of the get method
	public void setPlayerName(String playerName) { //you can set playername values
		this.playerName = playerName; } // end of the set values
	public String getUsingFoot() {
		return usingFoot; }
	public void setUsingFoot(String usingFoot) {
		this.usingFoot = usingFoot; }
	public int getPlayerNumber() {
		return playerNumber; }
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber; }
	public int getAge() {
		return age; }
	public void setAge(int age) {
		this.age = age; }
	public int getHeight() {
		return height; }
	public void setHeight(int height) {
		this.height = height; }
	public int getWeight() {
		return weight; }
	public void setWeight(int weight) {
		this.weight = weight; } }