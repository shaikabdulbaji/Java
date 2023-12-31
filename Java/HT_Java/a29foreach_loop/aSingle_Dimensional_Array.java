package a29foreach_loop;

public class aSingle_Dimensional_Array {
	
	/*
	 * e for-each loop ni extended for-each loop kuda antaru.
	 * Syntax for for-each loop :
	   for(dataType varName : array (or) collection)
	   {
	   		//statements
	   }
	   
	 * for loop indexes tho pani una prathi sari use cheasukuntamu, but for-each tho a index
	   value kavalanta aa index value retrieve chaiyaleamu.
	 */
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,4,6,8,0};

		System.out.println("For accessing all values from Array");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Accessing all values from array by using for-each loop");
		for(int value : arr)
		{
			System.out.println(value);
		}
		
		System.out.println("For accessing all even values from Array");
		for(int i=0; i<arr.length; i=i+2)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Adding and average of values by using for-each loop");
		int sum=0;
		for(int value : arr)
		{
			sum = sum+value;
		}
		System.out.println(sum);
		System.out.println(sum/arr.length);
	}

}
