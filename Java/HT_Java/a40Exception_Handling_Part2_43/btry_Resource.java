package a40Exception_Handling_Part2_43;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * try resource antaru deni edi nduku ekada vadtunamu antea, mana fr and br  ani rendu readers open
   cheasamu vatini close chaiyali antea koni koni sarlu marchipothu untamu alanti time lo manaki elanti
   try resource aneadi panikochidi. try() aa paranthasis lo manam statements estunam kada vatini
   parameters antaru. ala echinapudu fr and br kada chudandi alanti error ravatleadu.
 * edi una kuda manam close() anea method use cheasina emi error radu.  
 * manki e readers autocloseable ani ala telusus antea aa FileReader and BufferedReader pai cursor peti
   "fn+f3" click cheasukuntu potea manaki kanapadidi.
 */

public class btry_Resource {
	
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

		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
