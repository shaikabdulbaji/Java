package a40Exception_Handling_Part1;

import java.util.Arrays;

/*
 * a statement itea exception create chestundo aa statement ni "try block" lo pedtamu.
 * aa throw cheasina exception ni patukoni manam em cheptea adi chaiyataniki "cath block" use chestamu.
 */

public class cException_by_try_catch_block {

	public static void main(String[] args) {
		
		System.out.println("Program Execution Started");
		
		int a = 10;
		int b = 0;		
		int result = 0;
		
		
		try {
			result = a / b;
		}catch(ArithmeticException ae) {
			//System.out.println(ae.toString());  //exception string la mari console lo print iedi.
			//System.out.println(ae.getMessage()); //exception ki una message matram a print iedi.
			//System.out.println(Arrays.toString(ae.getStackTrace())); //a line lo exception vachindi elanti vi print iedi.
			ae.printStackTrace(); //edi  itea motham detail ga estadi exception aneadi.
		}
	
		
		System.out.println("Output is : " +result);
		
		System.out.println("Program Execution Ended");
	}


}
