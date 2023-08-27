package a21Decision_making_Statements;

/*
 * if and elseif both are condition based conditional statements.
 * switch is a value based conditional statements.
 * if the value matches then it will break the statement,if not it will execute the default statement.
 * Syntax : 
   switch(key){
   		Case value;
	   		//statements
	   		break;
	   		
	   	default;
	   		//statements
	   		break;
   }
 */

public class switch_ {
	
	public static void main(String[] args) {
		
		int i = 5;
		
		switch(i) {
		case 1:
			System.out.println("This is First Statement");
			break;
		case 3:
			System.out.println("This is Second Statement");
			break;
		case 6:
			System.out.println("This is Third Statement");
			break;
		default :
			System.out.println("This is Default Statement");
			break;
		}
		
		
		
		
	}

}
