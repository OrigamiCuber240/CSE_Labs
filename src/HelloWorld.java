import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner object= new Scanner(System.in);
		System.out.println("What is your name?");
		
		String name = object.nextLine();
		object.close();
		
		System.out.println("Hello and Welcome to "+name+"'s World!");
	}
}