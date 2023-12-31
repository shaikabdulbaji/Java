package a40Exception_Handling_Part1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * ekada "throws" gurinchi matladukuntunam, adina exception vastea adi manam or java evaro vakalu 
   handle chaiyali.
 * manam handel cheaseatatu iteaa try catch blocks use chestamu.
 * adea java ganaka handel cheaseatatu untea main method pakana throws ani rasi e exception akada rastamu.
   manaki mundea ala telusu e exception throws paka rayataniki antea, manam rasina statement ki kinda red 
   line la vastadi dani pai cursor peditea apudu aa exception kanapadidi.
   for eg : public static void main(String[] args) throws FileNotFoundException, InterruptedException
 */

public class fException_by_throws {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		
		System.out.println("Program Execution Started");
		
		int a = 10;
		int b = 0;		
		int result = 0;
		
		File file = new File("D:/resume.docx");
		FileInputStream fis = new FileInputStream(file);
		Thread.sleep(2000);
		
		try {
			result = a / b;
		}catch(ArithmeticException ae) {
			System.out.println(ae.toString());
			
			throw ae;
		}
		finally {
			System.out.println("Finally block");
		}
	
		
		System.out.println("Output is : " +result);
		
		System.out.println("Program Execution Ended");
	}


}
