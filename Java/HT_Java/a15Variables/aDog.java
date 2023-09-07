package a15Variables;

public class aDog {
	
	/*
	 * A variable is a container which holds the value while the java program is executed.
	  
	 * epudu dog anea example tisukundam dog ki koni properties untai antea barking, 
	   breed, eating, sleeping etc..
	 * aa properties ni java lo represent chaiyalantea variables rupam lo represent
	   chestamu.
	 */
	
	/*
	 * Different types of variables is
	     1. Instance variables (Non-StaticFields)  vitini manam non-static fields ani kuda antamu.
	     2. Classic variables (Static Fields)
	     3. Local variables
	     4. Parameters
	     
	   1&2 are Global variables.
	   3&4 are Local variables.
	 */
	
	// Datatype variableName = variableValue;
	
	public static void main(String[] args) {
		
		//int pincode = 500038;  //Direct defining and initialization (ekada mundea value telistea assign chaivachu leakapotea tarvata ina assign cheasukovachu)
		
		int pincode;			//defining 
		pincode = 522608;  		//initialization
		pincode = 500001;		//ela 2 times initialization chestea latest ga initialize cheasindi tisukuntundi java.
		
		System.out.println(pincode);
		
	}

}
