package a15Variables;

/*
 * Instance variables,  vitini manam non-static fields ani kuda antamu.
 * Instance variables vitini class level lo create chaiyali. (class starting lo ina parleadu, class 
   ending lo ina parleadu).
 * variable ki "static leakapotea instance variable" antamu adea "variable ki static untea class variable" antamu
 */

public class cStudent_classVariables {
	
	static int id = 101;  //vitini manam static fields antamu. out side of method create chestamu.
	String name = "sk";   //string is special case in java dini literal ani kuda antamu
	
	public static void main(String[] args) {
				
		/*
		 
		 * adea static itea direct ga call chiayavachu object create chaiyakunda.
		 * adina method ki static and variable ki static untea direct ga call chaiyavachu, object create
		   chaiyakunda.
		   
		 * new cStudent_classVariables().name
		   new cStudent_classVariables() --> this is instance (or) constructors
		   
		   string aneadi non-static kabati manam direct ga call chaiyaleamu andukea instance create
		   cheasi call cheasamu.
		   
		 */
		
		System.out.println(id);
		
		System.out.println(new cStudent_classVariables().name);
		
		test();
		
	}
	
	public static void test()
	{
		System.out.println(id);
	}

}
