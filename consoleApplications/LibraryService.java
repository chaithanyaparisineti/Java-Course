package consoleApplications;

public class LibraryService implements Library {
	static Book[]books= new Book[10];
	static int count=0;
	@Override
	public void createBook(Book book) {
		if(count<books.length) {
			books[count++]=book;
			System.out.println("Book added Successfully");
		}else {
			System.out.println("Library is Full");
		}	
	}
	@Override
	public void allBooks() {
		if(count!=0) {
			for(int i=0;i<count;i++) {
				Book currentbook=books[i];
				currentbook.displayBook();
			}
		}else {
			System.out.println("Found Zero Books!!");
		}	
	}
	@Override
	public Book findBookById(int bookid) {
		
		return null;
	}

	@Override
	public void updateBook(int bookid, Book book) {
		
		
	}

	@Override
	public void deleteBook(int bookid) {
		
		
	}

}
