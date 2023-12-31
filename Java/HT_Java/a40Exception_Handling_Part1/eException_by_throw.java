package a40Exception_Handling_Part1;

/*
 * ekada "throw" gurinchi matladukuntunam. ekada throw aneadi catch block lo rastamu, exception catch 
   cheasina tarvata throw chestamu like cricket ball catch cheasina tarvata throw cheasinatu.
 * aa throw cheasina exception evaru patukovali inka evaru java nea patukuntundi. java paukuntea handel
   chaiyaleadu adi exception throw chestadi. aa exception handel chaiyatanikea try and catch block use
   chestamu.
   
 * finally is optional una leakuna pedaga difference em undadu exception e radu.
 * try is always mandatory.
 * catch aneadi mandatory a but some times edi kuda optional adi apudu antea finally unapudu catch aneadi
   optional.
 */

public class eException_by_throw {

	public static void main(String[] args) {
		
		System.out.println("Program Execution Started");
		
		int a = 10;
		int b = 0;		
		int result = 0;
		
		
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
