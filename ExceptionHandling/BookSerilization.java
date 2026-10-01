package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Books implements Serializable {

   // private static final long serialVersionUID = 1L;

    transient int BookId;
    String title;
    String author;
    double price;

    public Books(int BookId, String title, String author, double price) {
        this.BookId = BookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class BookSerilization {

    public static void main(String[] args) {

        Books b = new Books(1215, "Bombay", "ManiRathnam", 499.00);

        // Serialization
        try {
            FileOutputStream fos = new FileOutputStream("BookData");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(b);

            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try {
            FileInputStream fis = new FileInputStream("BookData");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Books book = (Books) ois.readObject();

            System.out.println("\n*** Book Details ***");
            System.out.println("Book ID: " + book.BookId);
            System.out.println("Book Title: " + book.title);
            System.out.println("Book Author: " + book.author);
            System.out.println("Book Price: " + book.price);

            ois.close();
            fis.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}