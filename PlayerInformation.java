package League;

public class PlayerInformation extends TeamInformation { // this class extends upper class
	protected String secondNationality,thirdNationality;
	protected int goal,assist,games;
	protected boolean freekick,penalty,corner;
	public PlayerInformation(String name,String nickname,String establishmentYear,String playerName,String usingFoot,int playerNumber,int age, int height, int weight, String secondNationality,String thirdNationality, int goal, int assist, int games, boolean freekick, boolean penalty, boolean corner) { 
		super(name,nickname, establishmentYear, playerName, usingFoot, playerNumber, age, height, weight);
		this.secondNationality=secondNationality;
		this.thirdNationality=thirdNationality;
		this.goal=goal;
		this.assist=assist;
		this.games=games;
		this.freekick=freekick;
		this.penalty=penalty;
		this.corner=corner; }
	public String getSecondNationality() {
		return secondNationality; }
	public void setSecondNationality(String secondNationality) {
		this.secondNationality = secondNationality; }
	public String getThirdNationality() {
		return thirdNationality; }
	public void setThirdNationality(String thirdNationality) {
		this.thirdNationality = thirdNationality; }
	public int getGoal() {
		return goal; }
	public void setGoal(int goal) {
		this.goal = goal; }
	public int getAssist() {
		return assist; }
	public void setAssist(int assist) {
		this.assist = assist; }
	public int getGames() {
		return games; }
	public void setGames(int games) {
		this.games = games; }
	public boolean isFreekick() {
		return freekick; }
	public void setFreekick(boolean freekick) {
		this.freekick = freekick; }
	public boolean isPenalty() {
		return penalty; }
	public void setPenalty(boolean penalty) {
		this.penalty = penalty; }
	public boolean isCorner() {
		return corner; }
	public void setCorner(boolean corner) {
		this.corner = corner; } }