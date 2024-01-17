package a35Access_Modifiers;

/*
 * final is a non-access modifier used for classes and methods and variables.
 
 classes:
 -------
 * when you used final for class we can't inherit that class to another classes in same package
   and we can't inherit that class to another classes in different package.
 * final modifiers specified classes cannot be inherited/extended by other classses.
  
 variables:
 ---------
 * when you used final for variables we can't reassign the value to that keyword to reassign the 
   value we want to remove the final keyword for old value.
 * The value of the variable cannot be changed on specifying it with final non-access modifier.
   
 methods:
 -------
 * when you used final for methods we can use that methods out of the class.
 * final modifiers specified methods in a class cannot be override by its sub-class.
 */

public class gfinal_non_access_modifier {
	
	//String accountTypeOne; //Valid --> deniki initialization aavasaram leadu
	//final String AccountTypeOne; //Invalid -->Initialization kavali ani adugutadi java
	final String AccountTypeOne = "Savings"; 
	
	public void depositeMoney() {
		
		//AccountTypeOne = "Current";
		
		System.out.println("Deposite Money");
		
	}

}
