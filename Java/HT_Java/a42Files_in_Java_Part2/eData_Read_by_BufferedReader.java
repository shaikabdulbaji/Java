package a42Files_in_Java_Part2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class eData_Read_by_BufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();		
		
		/*
		//This code is enough to print the text from text file.
		FileReader fr = new FileReader(file);
		int asciiCode;
		while((asciiCode = fr.read()) != -1) {
			System.out.print((char)asciiCode);
		}
		
		
		FileReader fr = new FileReader(file);
		int asciiCode;
		String text = " ";
		while((asciiCode = fr.read()) != -1) {
			text = text + String.valueOf((char)asciiCode);
			System.out.print((char)asciiCode);
		}
		System.out.println();
		System.out.println(text);
		
		
		FileReader fr = new FileReader(file);		
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		*/
		
		FileReader fr = new FileReader(file);		
		BufferedReader br = new BufferedReader(fr);
		String text = "";
		String line = "";
		while((line = br.readLine()) != null) {
			text = text + line + "\n";
		}
		System.out.println(text);
		
		fr.close();
		br.close();
	}
	
	

}
