package a19Scanner_class;

import java.io.IOException;
import java.util.Scanner;

/*
 * System.out --> edi simple ga get out antea result ni out chestundi, out antea result console lo 
   print idi.
 * System.in --> edi simple ga get in antea result ni in chestundi, in antea result console lo 
   evali manam.
 * System.err --> edi adina result ni red color lo reflect chestundi console lo.
 
 * /n --> "/n" antea next line ani ardam.
 */

public class UserInput {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your Name?");		
		String name = scanner.nextLine();
		System.out.printf("Hey %s, How are you? /n", name);
		String status = scanner.nextLine();
		System.out.println("What is your age?");
		int age = scanner.nextInt();
		System.out.println("Thank you for your information");
		
		/*
			scanner.nextBoolean(); // we send boolean value
			scanner.nextFloat();  // we send float value
			scanner.nextShort();  // we send short value
			like this so many scanner statements are there.
		*/
		
		scanner.close();
	}

}
