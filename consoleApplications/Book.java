package consoleApplications;

public class Book {
	private int BookId;
	private String BookName;
	private String Author;
	private String YOP;
	private Double price;

	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	} 
	
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	
	public String getYOP() {
		return YOP;
	}
	public void setYOP(String yOP) {
		YOP = yOP;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Book(int bookId, String bookName, String author, String yOP, Double price) {
		super();
		BookId = bookId;
		BookName = bookName;
		Author = author;
		YOP = yOP;
		this.price = price;
	}
	public void displayBook() {
	System.out.println("BookId="+BookId);
	System.out.println("BookName="+BookName);
	System.out.println("Author="+Author);
	System.out.println("price="+price);
	System.out.println("yop="+YOP);	
	}
	
}
