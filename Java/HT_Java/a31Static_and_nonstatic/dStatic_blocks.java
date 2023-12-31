package a31Static_and_nonstatic;

/*
 * asal first static block and next non-static block and constructor and main method unai anuko series
   lo ani kalipi vakaeasari manam execute chestea.
 * first static block and next main method print aavutai. 
 * adea object untea main method lo first static block and next non-static block and constructor 
   and next main method print aavutai.
 */

public class dStatic_blocks {

	static int number;
	
	static {
		System.out.println("static method3");
		number = 10;
		/*
		 * e static blocks kuda manam ani kavalantea ani evachu, manam echina dani prakaram a execute
		   avutai e blocks kuda. duplication jaragadu and alanti error kuda throw chaiyadu.
		 */
	}
	
	static {
		System.out.println("static method1");
		number = 10;
		/*
		 * ekada amana initialization chaiyalantea chaiyavachu ndukantea 100 methods una vatikana
		   mundhu edi vakasari execute aavutundi.
		 * vakaveala manam constructor lo kani non-static method lo kani initilaize chestea dani
		   kosam object create cheasi call chaiyali. adea e static block ki ala aaavasaram leadu.
		   static una leakuna edi matram compulsory vakasari execute aavutundi.
		 */
	}
	
	static {
		System.out.println("static method2");
		number = 10;
	}
	
	{
		System.out.println("non-static method");
	}
	
	public dStatic_blocks() {
		System.out.println("constructor");
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		
		dStatic_blocks t1 = new dStatic_blocks();
		dStatic_blocks t2 = new dStatic_blocks();
		dStatic_blocks t3 = new dStatic_blocks();
		dStatic_blocks t4 = new dStatic_blocks();
		dStatic_blocks t5 = new dStatic_blocks();
		dStatic_blocks t6 = new dStatic_blocks();
	}

}
