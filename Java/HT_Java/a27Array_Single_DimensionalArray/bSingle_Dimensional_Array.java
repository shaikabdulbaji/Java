package a27Array_Single_DimensionalArray;

/*
 * paina una e object lo int j[] = new int[5]; a vidam ga data (or) values store aavutunai
   aneadi manam debugging mode lo chudochu.
   1. first program ni debug mode lo debug chaiyali apudu switch anea option adugutundi
      switch pai click cheastea vaka seperate mode lo open iedi eclipse.
   2. apudu manam "fn+f6" press chaiyali dani tarvata e statement lo int j[] = new int[5];
      j[] medha cursor place chestea manaku a vidam ga values aneadi store aavutunai aneadi
      kanapadtundi.
      
    //String[] j = new String[5];
 */

public class bSingle_Dimensional_Array {

	public static void main(String[] args) {
		
		/*
		int[] j = new int[5];
		
		j[0] = 5;
		j[2] = 6;
		j[4] = 9;
		
		j[2] = 89;
		j[2] = 50;
		*/
		
		//e paina process antha manki values assign cheasina tarvata telistea chesea process.
		//adea vaka veala values manaki mundea telistea e kinda process follow aavutamu.
		
		int j[] = {2,3,5,9,40};
		
		/*
		 * There are 3 ways to assigning the values to array :
		   1. int[] j = new int[5];		
			  j[0] = 5;
		      j[2] = 6;
			  j[4] = 9;
			  
		   2. int[] j = new int[]{2,3,5,9,40};
		   
		   3. int[] j = {2,3,5,9,40};
		   
		   manam elakuda chaiyavachu like define vaka chota and insialization vaka chota.
		   int j[];
		   j = new int[]{2,3,5,9,40};
		   
		   3rd type is the best type to assign the values to array, in this 3rd and 2nd types 
		   it is our wish we can give how many values we can give.
		 */
		
		
//		j[5] = 40; // manam ela estea array 0to4 a tisukuntundi 5 estea "arrayindexoutofboundexception" ani vastadi.
		
//		System.out.println(j[2]);
//		System.out.println(j[4]);
		
		/*
		 * vaka vaka index print chaiyali antea paina statements la estamu. motham indexes vakea
		   sari print aavali antea for loop ki veltamu.
		 
		 * i<j.length; j.length antea motha array size ani ardam.
		 */
		
		/*
		//e for loop tho array lo una values ani retrive chaivachu.
		for (int i=0; i<j.length; i++)
		{
			System.out.println(j[i]);
		}
		
		//For adding the all values in array
		int sum = j[0] + j[1] +j[2] + j[3] + j[4];
		System.out.println(sum);
		*/
		
		
		int i=0;
		while(i<j.length) {
			System.out.println(j[i]);
			i++;
		}
	}

}
