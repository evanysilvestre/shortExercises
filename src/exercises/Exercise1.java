package exercises;
/*Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Book {
	String title;
	String author;
	String isnb;
	
	public Book(String title, String author, String isnb) {
		this.title = title;
		this.author = author;
		this.isnb = isnb;
	}

	@Override
	public String toString() {
		return "Book [title: " + title + ", author:" + author + ", isnb:" + isnb + "]";
	}

}
public class Exercise1 {
	static Scanner scn = new Scanner(System.in);
	static List<Book> books = new ArrayList<>();
	
	static void addBook(String title, String author, String isnb) {
		Book book = new Book(title, author, isnb);
		books.add(book);
		System.out.println("Your book was added!");
	}
	
	static void removeBookByTitle(String title) {
		for (Book b: books) {
			if (b.title.equalsIgnoreCase(title)) {
				books.remove(b);
				System.out.println("The book " + b.title + " was removed!");
				break;
			} else {
				System.out.println("There is no book with this name. Try again.");
			}
		}
	}
	
	public static void main(String[] args) {
		
	}

}
