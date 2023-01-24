package ExamQuestion;

public class Librarian {
	String name; 
	String password;
	public boolean searchBook(Library Lib, int bookId){
		boolean isFound = false;
		for(int i = 0; i < Lib.getBooks().size(); i++) {
			Book book = Lib.getBooks().get(i);
			int tempBookId = book.getBookId();
			if(tempBookId  == bookId) {
				isFound = true; } }
		return isFound; }
	public boolean verifyMember(Library Lib, int memberId){
		boolean isFound = false;
		for(int i = 0; i < Lib.getReaders().size(); i++) {
			Reader reader = Lib.getReaders().get(i);
			int readerMemId = reader.getmRc().getMemberId();
			if(readerMemId == memberId) {
				isFound = true; } }
		return isFound; }
	public void issueBook(Library Lib, Reader r, int bookId) {
		int readerInd =  Lib.getReaders().indexOf(r);
		if(this.searchBook(Lib, bookId)) {
			// int bookIdIssued = 0;
			for(int i = 0; i < Lib.getBooks().size(); i++) {
				if(bookId == Lib.getBooks().get(i).getBookId()) {
					Book b = Lib.getBooks().get(i);
					r.borrowBook(b); } } } }
	public void calculateFine() {
		
	}
	public double createBill() {
		double bill = 5;
		return bill; }
	public void return_book(Library Lib, Reader r, int bookId) {
		boolean isBookFound = false;
		// int readerInd =  Lib.getReaders().indexOf(r); 
		for(int j = 0; j < r.getBooks().size() && isBookFound == false; j++) {
				int readBookId 	= r.getBooks().get(j).getBookId();
				if(readBookId == bookId) {
					Book b 		= r.getBooks().get(j);
					r.returnBook(b);
					break; } } } }