package ExamQuestion;

import java.util.ArrayList;

public class Author extends Person{
	
	private ArrayList<Book> books;
	
	public void newBook(String BookName) {
		Book newbook = new Book(super.name, BookName);
		books.add(newbook);
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
