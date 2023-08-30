package a40Exception_Handling_Part1;

/*
 * a statement itea exception create chestundo aa statement ni "try block" lo pedtamu.
 * aa throw cheasina exception ni patukoni manam em cheptea adi chaiyataniki "cath block" use chestamu.
 
 * for eg : aditea adi iendi ra finally naku manchea jarigindi ra antamu kada ala edi
 * finally aneadi exception throw cheasina chaiyakapoena "finally block" aneadi vaka sari execute aavutadi.
 * but finally aneadi optional undochu or undakapovachu. 
 */

public class dException_by_try_catch_finally_block {

	public static void main(String[] args) {
		
		System.out.println("Program Execution Started");
		
		int a = 10;
		int b = 0;		
		int result = 0;
		
		
		try {
			result = a / b;
		}catch(ArithmeticException ae) {
			System.out.println(ae.toString());
		}
		finally {
			System.out.println("Finally block");
		}
	
		
		System.out.println("Output is : " +result);
		
		System.out.println("Program Execution Ended");
	}


}
