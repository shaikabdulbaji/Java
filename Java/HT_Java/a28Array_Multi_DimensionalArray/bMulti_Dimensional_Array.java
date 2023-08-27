package a28Array_Multi_DimensionalArray;

public class bMulti_Dimensional_Array {
	
	/*
	 * Multi_Dimensional_Array have same values sets but jagged array doesn't have same set of values.
	 */

	public static void main(String[] args) {
		/*
		int[][] arr = new int[3][2];

		arr[0][0] = 1;
		arr[0][1] = 2;
		
		arr[1][0] = 3;
		arr[1][1] = 4;
		
		arr[2][0] = 5;
		arr[2][1] = 6;
		*/
		//System.out.println(arr[0][0]);
		
		//another way of initialization of values
		int[][] arr = {
				{1,2},
				{3, 4},
				{5, 6}
			};
		
		//another way of initialization of values
		//int[][] arr = new int[][]{{1,2}, {3, 4},{5, 6}};
		
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
