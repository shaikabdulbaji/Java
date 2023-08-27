package a20Decision_making_Statements;

/*
 * Syntax : it will execute postive outcomes
   if(condition)
   {
   		//statements
   }
   
 * Syntax : it will execute both postive and negative outcomes
   if(condition)
   {
   		//statements
   }else
   {
   	   //statements
   }
 */

public class nested_ifelse {

	public static void main(String[] args) {

		String extamStatus = "Pass";

		if (extamStatus == "Pass") {
			System.out.println("Qualify for First Round");
			String round1 = "Pass";
			if (round1 == "Pass") {
				System.out.println("Qualify for Second Round");
				String round2 = "Pass";
				if (round1 == "Pass") {
					System.out.println("You Win");
				} else {
					System.out.println("Go to Home");
				}
			} else {
				System.out.println("Go to Home");
			}
		} else {
			System.out.println("Go to Home");
		}

	}

}
