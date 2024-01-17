package a67this_keyword_in_Java;

import java.util.Arrays;

/*
 * manaki interview lo confuse chaiyataniki "this" keyword interfaces lo use chaigala leada ani 
   adugutaru? --> Answer is : Yes.
   
   But purpose aneadi different adi ala antea interfaces lo instance variables ni access chaiyataniki
   "this" anea keyword use chaiyamu, but deaniki use chestamu antea interface ni implement cheasea 
   classes yoka details ni get cheasukotaniki "this" anea keyword use chestamu.
   
   Arrays.toString(this.getClass().getDeclaredMethods() --> edi methods get kosam methods vakati undavu 
   ga chala untai anduku Array.toString() use chestamu.
   
   this.getClass().getName() --> edi class get kosam use chestamu class aneadi vakatea untadi kabati 
   Array avasaram leadu.
 */

public interface this_in_interface {
	
	void driveCar();

	String carCompanyName = "Jagvar";
	
	default void headLights() {
		
		System.out.println(Arrays.toString(this.getClass().getDeclaredMethods()));
		//System.out.println(this.getClass().getName()); //edi class names retur chaiyataniki.
	}
	
}
