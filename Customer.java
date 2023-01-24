package UserInheritance;
import java.util.Scanner;
public class Customer extends User{
	Scanner scan=new Scanner(System.in);
	private String customerName,address,email,creditCardInfo;
	private double shippingInfo;
	public Customer(boolean loginStatus, String customerName,String address,String email,String creditCardInfo,double shippingInfo) {
		super(loginStatus);
		this.customerName=customerName;
		this.address=address;
		this.email=email;
		this.creditCardInfo=creditCardInfo;
		this.shippingInfo=shippingInfo; }
	public String getCustomerName() {
		return customerName; }
	public void setCustomerName(String customerName) {
		this.customerName = customerName; }
	public String getAddress() {
		return address; }
	public void setAddress(String address) {
		this.address = address; }
	public String getEmail() {
		return email; }
	public void setEmail(String email) {
		this.email = email; }
	public String getCreditCardInfo() {
		return creditCardInfo; }
	public void setCreditCardInfo(String creditCardInfo) {
		this.creditCardInfo = creditCardInfo; }
	public double getShippingInfo() {
		return shippingInfo; }
	public void setShippingInfo(double shippingInfo) {
		this.shippingInfo = shippingInfo; }
	public double bill(double bill) {
		return bill; }
	public void login() {
		while(getLoginStatus()==false) {
			System.out.print("User Id: ");
			String userID=scan.next();
			System.out.print("Şifre: ");
			String password=scan.next();
			verifyLogin(userID, password); } }
	public void UpdateProfile() {
		
	}
	public void calculateNextBillAmount() {
		setShippingInfo(shippingInfo+getShippingInfo()); }
	public void generateInvoicePdfVersion() {
		System.out.println(); }
}
