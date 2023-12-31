package a40Exception_Handling_Part2_43;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * one try and multiple catch blocks are Valid.
 * multiple try and multiple catch blocks are Invalid.
 * multiple try and catch blocks are valid, means one try and catch and another try and catch.
 * finally block aneadi compulsory vaka sari execute aavutadi.
 
 Note :
 * finally elanti paristhithi lo ina execute aavutadi, adi a case lo execution apidi antea
   System.exit(0); e statement rastea execution agipotundi.
 * System.exit(0); --> e statement ekada rastamo akada nunchi tarvata lines avi execute kavu ntha
   important ina or ntha priority ina, aa line a last inka execution ki.
 */

public class ctry_with_multiCatch_blocks {
	
public static void main(String[] args) throws Exception {
		
		File file = new File("./sample2.txt");
		if(!file.exists())
			file.delete();
			file.createNewFile();
		
		//AutoCloseable
		try(
			FileReader fr = new FileReader(file);		
			BufferedReader br = new BufferedReader(fr);
				){
			
			String text = "";
			String line = "";
			while((line = br.readLine()) != null) {
				text = text + line + "\n";
			}
			System.out.println(text);
			
			int arr[] = {1,2};
			System.out.println(arr[1]/0);
		}catch(FileNotFoundException e1) {
			System.out.println("Catch Block");
		}
		finally {
			System.out.println("Finally Block");
		}
//		catch(ArrayIndexOutOfBoundsException | ArithmeticException e2) {
//			e2.printStackTrace();
//			//System.err.println("Please use the index with in the array range");
//			System.out.println("Common Output");
//		}
//		catch(ArithmeticException e3) {
//			e3.printStackTrace();
//			System.err.println("Please don't divide the number with zero");
//		}
	}

}
