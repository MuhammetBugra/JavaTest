package ExamQuestion;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Book> books;
	private ArrayList<Reader> readers;
	
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public void setReaders(ArrayList<Reader> readers) {
		this.readers = readers;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public ArrayList<Reader> getReaders() {
		return readers;
	}

	public void newBook(Book b) {
		books.add(b);
	}
	
	// public void lendBook(Book b, ) 
	// public void takeBackBook(Book b, )
	
	
	public void showBook() {
		for(int i = 0; i < this.books.size(); i++) {
			books.get(i).display();
		}
	}

}
