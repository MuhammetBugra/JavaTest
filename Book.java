package ExamQuestion;

public class Book {	
	private int bookId; 
	private String author;
	private String name;
	private double price;
	private String status;
	private String edition;
	private String dateofPurchase;
	private String owner; 
	public int getBookId() {
		return bookId; }
	public void setBookId(int bookId) {
		this.bookId = bookId; }
	public String getAuthor() {
		return author; }
	public void setAuthor(String author) {
		this.author = author; }
	public String getName() {
		return name; }
	public void setName(String name) {
		this.name = name; }
	public double getPrice1() {
		return price; }
	public void setPrice(double price) {
		this.price = price; }
	public String getStatus() {
		return status; }
	public void setStatus(String status) {
		this.status = status; }
	public String getEdition() {
		return edition; }
	public void setEdition(String edition) {
		this.edition = edition; }
	public String getDateofPurchase() {
		return dateofPurchase; }
	public void setDateofPurchase(String dateofPurchase) {
		this.dateofPurchase = dateofPurchase; }
	public Book(String author, String name){
		this.author = author; 
		this.name   = name; }
	public String getTitle(){
		return name; }
	public void changeOwner(String newowner) {
		this.owner = newowner;  }
	public String getOwner(){
		return owner;  }
	public void display(){
		System.out.println("bookId"          + this.bookId         + "\n" + 
						   "author"          + this.author         + "\n" + 
						   	"name"           + this.name           + "\n" +
						   	"price"          + this.price          + "\n" +
						   	"status"         + this.status         + "\n" +
						   	"edition"        + this.edition        + "\n" +
						   	"dateofPurchase" + this.dateofPurchase + "\n" +
						   	"owner"          + this.price          + "\n");  }
	public void update_Status(String newStatus) {
		this.status= newStatus; }
	public int getPrice() {
		return 0; }	 }