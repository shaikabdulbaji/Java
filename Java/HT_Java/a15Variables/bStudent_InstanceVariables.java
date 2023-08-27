package a15Variables;

/*
 * Instance variables, vitini manam non-static fields ani kuda antamu.
 * Instance variables vitini class level lo create chaiyali. (class starting lo ina parleadu, class 
   ending lo ina parleadu).
 */

public class bStudent_InstanceVariables {
	
	int id = 101;  //vitini manam non-static fields antamu. out side of method create chestamu.
	
	public static void main(String[] args) {
		
		//System.out.println(id);  //Cannot make a static reference to the non-static field id
		
		/*
		 * outside of method untea direct ga call chaiyaleamu, danikosam object create chaiyali.
		 * adea static itea direct ga call chiayavachu object create chaiyakunda.
		 */
		
		bStudent_InstanceVariables siv = new bStudent_InstanceVariables();
		System.out.println(siv.id);
		
	}

}
