package a15Variables;

	/*
	 * Rules for Naming Convention for variables :
	   1. case sensitive (Always variables are in lower case only)
	      for eg :
	      static int id = 100;
		  static String name = "sk";
		  
	   2. one word variable la estea lower case lo evali.
	   	  for eg :
	   	  static String firstName = "abdul";
	   	  name --> single word
	   	  Firstname --> double word.
	   	  
	   3. more than one word untea camel case lo evali.
	   	  for eg :
	   	  static String firstNameShaik = "baji";
	   	  single word --> name (ala echina okay)
	   	  double word --> FirstName --> firstName (ela evali deni camel case antamu)
	   	  triple word --> FirstNameShaik --> firstNameShaik (ela evali deni camel case antamu)
	   	
	   4. keywords variables laga evakudadu.
	   	  for eg :
	   	  int class = 20;
	   	  
	   5. shortcuts upayogincha vachu kani rear cases. like firstname itea fn ani ala.
	      for eg :
	      static String fn = "abdul";
	   	  antea manam echea variable self explanatory la undali.
	   	  evarana kotha developer vastea for understanding purpose.
	   	  
	   6. mana special charaters use chaiyakudadu except _,$ evi rendu use cheasukovachu.
	      for eg :
	      static String _firstName = "abdul";
	      static String first_Name_Shaik = "baji";

	   
	   
	 */

public class fNaming_Convention_for_variables {
	
	static int id = 100;
	static String name = "sk";
	static String firstName = "abdul";
	static String firstNameShaik = "baji";
	//int class = 20;
	static String first_Name$Shaik = "baji";
	
	
	public static void main(String[] args) {
		
		
		
	}

}
