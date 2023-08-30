package a35Access_Modifiers_sub_class;

import a35Access_Modifiers.fprotected_modifier;

/*
 * subclass aneadi protected ki verea package lo use cheasukogalamu.
 * default ki and protected ki main difference edea, protected sub class ni verea package work aavutadi
   but default ki work aavadu.
 */


public class hprotected_modifier extends fprotected_modifier{
	
	public static void main(String[] args) {

		new hprotected_modifier().test();
	}
	
	public void test() {
		System.out.println(rollNo);
		printRollNumber();
		
	}

}
