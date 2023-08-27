package a28Array_Multi_DimensionalArray;

public class cJagged_Array {
	
	/*
	 * Multi_Dimensional_Array have same values sets but jagged array doesn't have same set of values.
	 */

	public static void main(String[] args) {
		
		int[][] arr = {
				{1,2,3},
				{3, 4, 56, 75},
				{5}
			};
		
		int size = 0;
		for(int i=0; i<arr.length; i++)
		{
			size = size+arr[i].length;
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println(size);
		
	}

}
