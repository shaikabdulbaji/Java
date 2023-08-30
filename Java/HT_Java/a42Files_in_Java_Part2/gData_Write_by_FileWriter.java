package a42Files_in_Java_Part2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class gData_Write_by_FileWriter {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("./sample2.txt");
		if(!file.exists())
			file.delete();
			file.createNewFile();
		
		String s = "hello world";
		FileWriter fw = new FileWriter(file);
		//fw.write(s);
		fw.write(s.toCharArray());
		
		fw.close();
	}
	
	

}
