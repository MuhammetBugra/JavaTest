package ExamQuestion;


public class memberRecord {
	private int memberId;
	private String type;
	private String dateOfMembership;
	private int numBookIssued;
	private int maxBookLimit;
	private String name; 
	private String address;
	private int phoneNo;
	private int totalPaidAmount; 
	public int getMemberId() {
		return memberId; }
	public void setMemberId(int memberId) {
		this.memberId = memberId; }
	public String getType() {
		return type; }
	public void setType(String type) {
		this.type = type; }
	public String getDateOfMembership() {
		return dateOfMembership; }
	public void setDateOfMembership(String dateOfMembership) {
		this.dateOfMembership = dateOfMembership; }
	public int getNumBookIssued() {
		return numBookIssued; }
	public void setNumBookIssued(int numBookIssued) {
		this.numBookIssued = numBookIssued; }
	public int getMaxBookLimit() {
		return maxBookLimit; }
	public void setMaxBookLimit(int maxBookLimit) {
		this.maxBookLimit = maxBookLimit; }
	public String getName() {
		return name; }
	public void setName(String name) {
		this.name = name; }
	public String getAddress() {
		return address; }
	public void setAddress(String address) {
		this.address = address; }
	public int getPhoneNo() {
		return phoneNo; }
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo; }
	public int getTotalPaidAmount() {
		return totalPaidAmount; }
	public void setTotalPaidAmount(int totalPaidAmount) {
		this.totalPaidAmount = totalPaidAmount; }
    public int getMember() {
		return memberId; }
	public void increaseBookIssued(int numBooks) {
		if(numBookIssued + numBooks <= maxBookLimit) {
			this.numBookIssued += numBooks; } }
	public void decreaseBookIssued(int numBooks) {
			this.numBookIssued -= numBooks; }
	public void payBill(int amount) {
			this.totalPaidAmount += amount; } }