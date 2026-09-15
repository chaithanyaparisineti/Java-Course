package consoleApplications;

public interface Library {
	
    void createBook(Book book);

    void allBooks();

    Book findBookById(int bookid);

    void updateBook(int bookid, Book book);

    void deleteBook(int bookid);
}
