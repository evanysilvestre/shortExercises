package exercises;
/*Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.*/
import java.util.Scanner
import java.util.List;
import java.util.ArrayList;

class Book {
	String title;
	String author;
	String isnb;
}

public Book(String title, String author, String isnb) {
	this.title = title;
	this.author = author;
	this.isnb = isnb;
}


@Override
public String toString() {
    return "Book [Title:" + title + ", Author: " + author + ", ISNB: " + isnb + "]";
}

public class Exercise1 {
	static Scanner scn = new Scanner(System.in);
	static List<Book> books = new ArrayList<>();
	
	static void addBook(String title, String author, String isnb) {
		static Book book = new Book(title, author, isnb);
		books.add(book);
		
		System.out.println()
	}
	
	public static void main(String[] args) {
		Syste.out.println("Title: ");
		String title = scn.nextLine();
		Syste.out.println("Author ");
		String author = scn.nextLine();
		Syste.out.println("ISNB: ");
		String isnb = scn.nextLine();
		
		addBook(title, author, isnb);
		
	}
	/*static void removeBookByTitle(String title) {
		for (Book b: books) {
			if (b.title.equalsIgnoreCase(title)) {
				books.
			}
		}
	}*/
}
