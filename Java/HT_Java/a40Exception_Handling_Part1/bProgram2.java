package a40Exception_Handling_Part1;

public class bProgram2 {

	public static void main(String[] args) {
		method2();
	}
	
	public static void method2() {
		method1();
	}
	
	public static void method1() {
		int a = 10;
		int b = 0;
		
		int result = 0;
	
		result = a / b;
		
		System.out.println(result);
	}

}

/*
 * paina program run chestea exception vastadi ekada exception lo only 4 lines untai. 
 */