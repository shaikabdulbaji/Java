package a22Constructor;

public class eMemory_allocation_for_default_constructors {
	
	public int i;
	
	public static void main(String[] args) {
		
		eMemory_allocation_for_default_constructors ec = new eMemory_allocation_for_default_constructors();
		/*
		 * ekada manam i ki a value evaleadu apudu manam i ni print chestea default value for 
		   int is "0" print iedi.
		 * java internal ga default constructor ni call cheasi default value print cheasidi
		 */
		System.out.println(ec.i);
		
	}

}
