package a26Looping_Statements;

public class bfor {
	
	public static void main(String[] args) {
		
		int i;
		for(i=0; i<10; i++) {
			
			System.out.println(i);
		}
		System.out.println("Loop executed " +i+ " times");
		
		for(i=0; i<10; i+=2) {
			
			System.out.println(i);
		}
		System.out.println("Loop executed " +i+ " times");

		/*
		 * for(i=1; i<10; i*=2) {
		 * 
		 * System.out.println(i); } System.out.println(i);
		 */
		// paina la kakunda for loop lo condition and updation rendu tisestea ela kuda try chaiyochu
		
		for(i=1; ; ) {
			  
			if(i<10) {
			  System.out.println(i); 
			  i*=2;
			}else
				break;
			  
		}
		System.out.println(i);
		
	}

}
