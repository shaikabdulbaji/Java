package a20Decision_making_Statements;

/*
 * Decision making statements are based on result they will execute.
 * There are three types of decision making statements are there :
   1. if
   2. else if
   3. switch
   
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

public class if_ {
	
	public static void main(String[] args) {
		
		int i = -10;
		
		if(i<0)
		{
			System.out.println("It is negtive number");
		}if(i>0)
		{
			System.out.println("It is postive number");
		}
		
		/*
		 * ekada "if" statements lo disadvantage entantea only one true (or) false adovakatea execute
		   aavutundi malli inko statement kavali antea malli "if" statement rayali.
		   edi overcome chaiyataniki manam if else ki veltamu andulo both true and false rendu execute 
		   aavutai statements.
		 */
		
		
	}

}
