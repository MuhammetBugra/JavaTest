package UserInheritance;

public class User {
	private String userID,password;
	private boolean loginStatus;
	public User(boolean loginStatus) {
		this.userID="1";
		this.password="0000";
		this.loginStatus=loginStatus; }
	public String getUserID() {
		return userID; }
	public void setUserID(String userID) {
		this.userID=userID; }
	public String getPassword() {
		return password; }
	public void setPassword(String password) {
		this.password=password; }
	public boolean getLoginStatus() {
		return loginStatus; }
	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus=loginStatus; }
	public void verifyLogin(String userID, String password) {
        if(this.userID==userID && this.password==password)
        	setLoginStatus(true);
        else
        	setLoginStatus(false); }
}