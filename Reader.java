package ExamQuestion;

import java.util.ArrayList;

public class Reader extends Person{
	
	private ArrayList<Book> books;
	private int purchaseBillAmount;
	private memberRecord mRc;
	
	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public int getPurchaseBillAmount() {
		return purchaseBillAmount;
	}

	public void setPurchaseBillAmount(int purchaseBillAmount) {
		this.purchaseBillAmount = purchaseBillAmount;
	}
	
	public memberRecord getmRc() {
		return mRc;
	}

	public void Reader(String name) {
		
		this.name 	= name;
		mRc 		= new memberRecord();
		mRc.setName(name);
		
	} 
	
	public void purchaseBook(Book b) {
		
		int index = books.indexOf(b);
		books.remove(index);
		mRc.decreaseBookIssued(1);
		purchaseBillAmount += b.getPrice1();
		
	}
	
	public void borrowBook(Book b) {
		
		books.add(b);
		mRc.increaseBookIssued(1);
		b.changeOwner(this.name);
		
	}
	
	public void returnBook(Book b) {
		
		int index = books.indexOf(b);
		books.remove(index);
		mRc.decreaseBookIssued(1);
		b.changeOwner("NoOwner"); // It could be null also.
		
	}
	
	public void showBook() {
		for(int i = 0; i < this.books.size(); i++) {
			books.get(i).display();
		}
	}
	
	public String whoYouAre() {
		return this.name;
	}
	
}
