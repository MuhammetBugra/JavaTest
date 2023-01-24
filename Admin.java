package UserInheritance;

public class Admin extends User {
	private String adminName,email;
	public Admin(boolean loginStatus,String adminName,String email) {
		super(loginStatus);
		this.adminName=adminName;
		this.email=email; }
	public String getAdminName() {
		return adminName; }
	public void setAdminName(String adminName) {
		this.adminName = adminName; }
	public String getEmail() {
		return email; }
	public void setEmail(String email) {
		this.email = email; }
	public void UpdateCatalog() {
		
	}
}
