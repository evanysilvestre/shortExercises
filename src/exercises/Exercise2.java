package exercises;
import java.util.Scanner;
//MY FIRST HANDS-ON TRY-CATCH CODE

/*Write a Java program that throws an exception and catch it using a try-catch block.*/
public class Exercise2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		try {
			System.out.println("Enter your name: ");
			byte age = scn.nextByte();
			System.out.println("Your age is: " + age);
		} catch (Exception e) {
			System.out.println("Something went wrong! ");
		}
		
		scn.close();
	}
}
