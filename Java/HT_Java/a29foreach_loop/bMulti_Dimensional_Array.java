package a29foreach_loop;

public class bMulti_Dimensional_Array {
	
	public static void main(String[] args) {
		/*
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		*/
		//Jagged Arrays kuda vadukovachu
		int[][] arr = {
				{1,2,3},
				{4,5,6,89,9},
				{7}
				};
		
		System.out.println("Accessing the values from Array");
		for(int[] singleDimensionalArray : arr)
		{
			for(int value : singleDimensionalArray)
			{
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		System.out.println("Adding and Average of values");
		int sum=0;
		int noofElements =0;
		for(int[] singleDimensionalArray : arr)
		{
			for(int value : singleDimensionalArray)
			{
				sum = sum+value;
				noofElements++;
			}
		}
		System.out.println(sum);
		System.out.println(sum/noofElements);
		
	}

}
