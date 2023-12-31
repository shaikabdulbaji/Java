package a42Files_in_Java_Part2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * Scanner class lo 2 methods unai
 * nextLine() --> entire line ni read chestundi.
 * next() --> vaka vaka token or word laga tisukuntundi.
 * and next data aneadi unda leada ani chusukotaniki 2 methods unai avi
 * hasNextLine() --> inko line unda leada ani chudataniki edi vadatamu.
 * hasNext() --> inko token or word unda leada ani chudataniki edi vadatamu.
 */

public class cData_Read_by_Scanner_Class {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		/*
		//hasNextLine() (or) hasNext() e rendintilo ado vakati use cheasukovachu.
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}		
		scan.close();
		*/
		
		Scanner scan = new Scanner(file);
		String text = " ";
		while(scan.hasNext()) {
			text = text + scan.nextLine() + "\n";
		}	
		System.out.print(text);
		scan.close();
	}

}
