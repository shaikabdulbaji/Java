package a18Operators;

public class cUnary_Operators {

	public static void main(String[] args) {
		
		int i=20;
		
		/*
		 * Preincrement : mundhu increment jargina tarvata aa value ni nuvu access cheasukuntam.
		 * Postincrement : mundhu value ni access cheasukuntam tarvata increment jargutundi .
		 */
		
//		System.out.println(i);  //20
//		System.out.println("Preincrement :"+ ++i); //21
//		System.out.println("----------------------"); 
//		System.out.println("Postincrement :"+ i++); //21
//		System.out.println(i);  //22
		System.out.println("-----------------------");
		System.out.println(i);  //20
		System.out.println("Preincrement :"+ --i);  //19
		System.out.println("----------------------");  
		System.out.println("Postincrement :"+ i--);    //19
		System.out.println(i);   //18
	}

}
