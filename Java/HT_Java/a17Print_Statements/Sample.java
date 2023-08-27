package a17Print_Statements;

public class Sample {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Abdul");
		System.out.print("sk");
		System.out.printf("The current year is %d and month is %s", 2022, "March");
		
		/*
		print ---> After executing cursor will be in same line.
		println ---> After executing cursor will be in next line.
		printf ---> we use this for formatting purpose.
		*/
		
		System.out.println("------------------------------------------------------------");
		
		// amana error ni console lo display chaiyali ante we use print statement like this :
		System.err.println("Hello Abdul");
		System.err.print("sk");
		System.err.printf("The current year is %d and month is %s", 2022, "March");
		
	}

}
