package a42Files_in_Java_Part2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class hData_Write_by_BufferedWriter {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("./sample2.txt");
		if(!file.exists())
			file.delete();
			file.createNewFile();
		
		String existingText = new String();
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader(file));
		while((line = br.readLine()) != null) {
			existingText = existingText + line + "\n";
		}
			
		/*
		 * e class lo manam normal ga una text ni ala read chaiyali and malli una daniki inka text 
		   ala add chaiyali.
		 */
		String s = "What are you doing";
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(existingText + s);
		//bw.write(s.toCharArray());
		
		bw.close();
	}
	
	

}
