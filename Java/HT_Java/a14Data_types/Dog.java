package a14Data_types;

public class Dog {
	
	/*
	 * a datatype is a classification of data which tells the compiler or interpreter how
	   the programmer intends to use the data.
	 * datatypes aneadi variables create cheseatapudu use chestamu.
	 * variable ki mundhu mana datatype estamu 
	   eg : int a = 10;
	   		String s = "sk";
	   int is datatype.
	   String is datatype.
	   a is variable.
	 */
	
	/*
	 * datatypes are two types primitive type and non-primitive type.
	 * default value of datatype is 
	   numbers is 0.
	   String is null.
	   boolean is true.
	   character is spacce.
	   
	 */

	public String breed = "German Shepad";
	public int height = 30;
	public int weight = 100;
	
	public static void main(String[] args) {

		/*
		 * Datatypes starts with capital letters are called as wrapper classes.
		 * Datatypes starts with small letters are called as datatypes.
		 * To find sizes of datatypes "/8" is for size of datatype.
		 
		//Size of datatype and wrapper classes
		System.out.println(Byte.SIZE/8);
		System.out.println(Short.SIZE/8);
		System.out.println(Integer.SIZE/8);
		System.out.println(Long.SIZE/8);
		System.out.println(Float.SIZE/8);
		System.out.println(Double.SIZE/8);
		System.out.println(Boolean.TYPE);
		System.out.println(Character.SIZE/8);
		*/
		
		byte a = 127;
		//Memory allocation
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		

		short b = 127;
		//Memory allocation
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		int c = 127;
		//Memory allocation
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		long d = 127473829048412l;
		//Memory allocation
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		float e = 127;
		//Memory allocation
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		double f = 127.858;
		//Memory allocation
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		char h = 'a';
		//Memory allocation
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
	}

}

