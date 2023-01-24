package ExamQuestion;

public class Book1 { //define class
	private String bookID,author,name,status,owner; //define string variables
	private int price,edition,dateOfPurchase;
	public Book1(String bookID,String author,String name,String status) { // constructor method
		this.bookID=bookID; } //define initial values
	public String getBookID() { //get book id
		return bookID; } //return bıd and close
	public void setBookID(String bookID) { // set bıd 
		this.bookID=bookID; } //set bıd and close
	public String getOwner(String owner) { // you can get owner
		return owner; } // return owner close
	public void display() { // display method
		System.out.println(bookID); } // write parameters
	public void updateStatus(String status) { // you can update status name
		this.status=status; } // update status
} //close this class
