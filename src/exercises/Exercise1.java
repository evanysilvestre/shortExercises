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
		return "Book [title: " + title + ", author: " + author + ", isnb: " + isnb + "]";
	}

}
public class Exercise1 {
	static Scanner scn = new Scanner(System.in);
	static List<Book> books = new ArrayList<>();
	
	static void addBook(String title, String author, String isnb) {
		Book book = new Book(title, author, isnb);
		books.add(book);
		System.out.println("Your book was added!");
		System.out.println(books);
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
	
	public static String askTitle() {
		System.out.println("Enter the title: ");
		String title = scn.nextLine();
		return title;
	}
	public static String askAuthor() {
		System.out.println("Enter the Author: ");
		String author = scn.nextLine();
		return author;
	}
	public static String askIsnb() {
		System.out.println("Enter the ISNB: ");
		String isnb = scn.nextLine();
		return isnb;
	}
	
	public static void main(String[] args) {
		int choose;
		boolean option = false;
		
		System.out.println("Book Store! ");
		do {
			System.out.println("Choose and option: ");
			System.out.println("1. Add a book ");
			System.out.println("2. Remove a book by title");
			choose = scn.nextInt();
			scn.nextLine();
			
			if (choose == 1) {
				option = false;
				String titleAnswer = askTitle();
				String authorAnswer = askAuthor();
				String isnbAnswer = askIsnb();
				addBook(titleAnswer, authorAnswer, isnbAnswer);
				
			} else if (choose == 2){
				option = false;
				
			} else {
				option = true;
				System.out.println("Invalid Option! Try again");
			}
			
		} while (option);
	}

}
