package a35Access_Modifiers;

public class dprivate_modifier {
	
	/*
	 * private modifier aneadi classes ki use chaiyaleamu ndukantea aa class ni aa class a use 
	   cheasukovali obiviously use cheasukoleamu kada.
	   reason : vaka class aneadi inko class lo ekadina use cheasukuntea nea class aneadi create
	    		chestamu, ntha data different una use cheasukoleamu.
	  
	 * private class ki use chaiyaleamu.
	 * private aneadi variable ki and constructor ki and method ki use cheasukovachu. 
	 * private aneadi variable ki and constructor ki and method ki petina within the class access 
	   cheasukovachu.  			
	 */

	private int rollNo = 101;
	
	//constructor
	private dprivate_modifier() {
		rollNo = 102;
	}
	
	//method
	private void printRollNumber() {
		System.out.println(rollNo);
	}
	
	//main method
	public static void main(String[] args) {
		
		dprivate_modifier dpm = new dprivate_modifier();
		System.out.println(dpm.rollNo);
	}

	public void abc() {
		printRollNumber();
	}
}
