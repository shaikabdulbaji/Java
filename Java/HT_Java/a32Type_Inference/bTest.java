package a32Type_Inference;

public class bTest {

	public static void main(String[] args) {

		//var can be used in the local variables.
		var i = 200000;
		
		/*
		 * var can't be used for only declaration purpose, insted it should be used along 
		   with initialisation.
		 * kinda unda state lo error chudandi paina line chudandi.
		   
		   var j;
		   j=20;
		 */
		
		
		//String str = "abdul";
		//boolean b = true;
		
		var str = "abdul";
		var b = true;
		int var = 10;
		var = var + var;
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(b);
		System.out.println(var);
		
		//when used with arrays, should not use the [] brackets.
		//var[] arr = new int[5];
		//arr[0] = 1;
	}

}
