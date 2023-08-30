package a40Exception_Handling_Part1;

public class bProgram1 {

	public static void main(String[] args) {
		method1();
	}
	
	//e method ni "stacktrace" antaru
	/*
	 * e exception lo em matter untadi antea
	 * Exception Name - java.lang.ArithmeticException.
	 * Exception message - / by zero
	 * Which line number.
	 * message info.
	 */
	public static void method1() {
		int a = 10;
		int b = 0;
		
		int result = 0;
	
		result = a / b;
		
		System.out.println(result);
	}

}

/*
 * paina program run chestea exception vastadi ekada exception lo only 3 lines untai. 
 */