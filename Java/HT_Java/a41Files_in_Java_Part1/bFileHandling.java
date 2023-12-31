package a41Files_in_Java_Part1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

/*
 * File file = new File("D:\\file\\resume.txt");
   D:\\file\\resume.txt --> e path entantea aa path place lo file untea tisukuntadi.
   D:\\file\\resume.txt --> edi inko vidam ga kuda vadochu ala antea file create chayavachu aa path lo.
   D:\\file\\resume.txt --> uthaga e name estea file create aavadu. tarvata vaka statement evali entantea
   file.createNewFile() --> e statement estea aa path place lo file aneadi create iedi.
   file.exists() --> e statement entantea akada file aneadi unda ani check chaiyatam.
   file.delete() --> e statement entantea akada una file ni delete chai ani ardam.
   file.isHidden() --> e statement entantea akada una file hide ienda leada ani check chaiiyatam. 
   file.canWrite() --> e statement entantea akada una file vaka veala default ga read only file itea 
   					   manam data ni rayocha leada ani ardam.
   file.setWritable(true) --> e statement entantea akada una file vaka veala default ga read only file
    						  itea aa read only mode nunchi bayatki tiyaniki vadtamu.
   file.canWrite() --> tarvata e statement estea manki ardamiedi e read onl mode nunchi bayataki 
   					   vachinda leada aneadi.
   D:\\file\\resume.txt --> edi inko vidam ga kuda vadochu ala antea file create chayavachu aa path lo.
   ./resume.txt --> e ./ aneadi project path, project lo create chestadi file aneadi.
   File file = new File("./Resources/"); --> edi project lo folder(Resource) create cheasidi.
   file.mkdir() --> e statement entantea vaka directory kavalantea edi use chestamu. 
   file.mkdirs() --> e statement entantea vakati kana akuva directories kavalantea edi use chestamu.
   for eg :
   	c://Resourse//english//short//
   Only short vaka directory kavalantea "file.mkdir()" edi use chestamu.
   Resourse, english, shortela aku directories kavalantea "file.mkdirs()" edi use chestamu.
   
   File file = new File("D:\\Java\\Java\\HT_Java");
   System.out.println(Arrays.toString(file.list()));
   e paina 2 statements entantea manam amana path echi danilo content print chaiyamantea 
   "Arrays.toString(file.list())" e statement use chestamu.
   
   System.out.println(Arrays.toString(file.list())); 
   					(OR)
   for(String filename : file.list()) {
			System.out.println(filename);
		}
		
   file.listFiles() --> e statement entantea files path latho saha print chestadi.
   file.getName() --> e statement entantea manam create cheasina file name estundi.
   file.getAbsolutePath() --> e statement entantea manam create cheasina file path estundi.
   file.getParent() --> e statement entantea manam create cheasina file path ki mundhu daka em untea adi 
                        print iedi.
   new Date(file1.lastModified()) --> e statement entantea manam echina file last a  time lo modify 
   cheasaru anea time estadi.
   
   file.isDirectory() --> e statement entantea manam create cheasindi directory or file aneaadi cheptundi.
   file.isFile() --> e statement entantea manam create cheasindi directory or file aneaadi cheptundi.
 */

public class bFileHandling {

	public static void main(String[] args) throws IOException {

		File file = new File("./resume.txt");
		//ekada paina statement lo china trick undi entantea "\\" (or) "/" ado vakati use chestea saripodi.
		
//		File file = new File("./Resources/");
//		System.out.println(file.mkdir());
		
		//kinda una 2 statements and paina una 2 statements a mkdir ki mkdirs una difference.
		
//		File file = new File("./Resources/Test/");
//		System.out.println(file.mkdirs());
		
//		File file = new File("D:\\Java\\Java\\HT_Java");
//		System.out.println(Arrays.toString(file.list()));
//		System.out.println(Arrays.toString(file.listFiles()));		
		
//		System.out.println(file.getName());
//		System.out.println(file.getAbsolutePath());
		
//		System.out.println(file.getParent());
//		File file1 = new File(file.getParent()+"/resume2.docx");
//		file1.createNewFile();
//		System.out.println(new Date(file1.lastModified()));
		
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
		
		/*
		if(file.exists())
			file.delete();
			System.out.println(file.createNewFile());
			
			System.out.println(file.isHidden());
			
			System.out.println(file.canWrite());
			
			file.setWritable(true);
			System.out.println(file.canWrite());
		*/
		
	}

}
