package ExceptionHandling;
class Book{
	void displayBook() {
		System.out.println("This is a Book");
	}
}
class magazine{
	void displaymagazine() {
		System.out.println("This is a magazine");
	}
}
public class BookEH {
	public static void main(String[] args) {
		System.out.println("main method started");
	Object obj=new magazine();//class ExceptionHandling.magazine cannot be cast to class ExceptionHandling.
//	Book (ExceptionHandling.magazine and ExceptionHandling.Book are in unnamed module of loader 'app')
		try {
		Book  b=(Book)obj;
		b.displayBook();
	}catch(ClassCastException e) {
		System.out.println("cannot cast magazine obj to book");
		System.out.println(e.getMessage());
	}
		System.out.println("\n*********************");
		Object obj1=new magazine();
		try {
			magazine m=(magazine)obj1;
			m.displaymagazine();
		}catch(ClassCastException e) {
			System.out.println("cannot cast book obj to magazine");
			System.err.println(e.toString());
		}
		System.out.println("main method ended");
	}
}
