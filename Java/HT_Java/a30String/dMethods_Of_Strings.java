package a30String;

import java.util.Arrays;

public class dMethods_Of_Strings {

	public static void main(String[] args) {
		
		String s1 = "HeLlo";
		String s2 = "hello";
		String s3 = "HELLO";
		String s4 = "  Shaik abdul";
		
		//.equals()
		System.out.println(s1.equals(s3)); //each and ecvery character matters	
		System.out.println(s1.equalsIgnoreCase(s3)); // lowercase and uppercase ni patinchukodu matter main
	
		System.out.println("-------");
		
		//.contains()
		System.out.println(s1.contains("He"));
		System.out.println(s1.contains("he"));
		
		System.out.println("-------");
		
		//.startsWith()
		System.out.println(s1.startsWith("He"));
		System.out.println(s1.endsWith("he"));
		System.out.println(s1.startsWith("HeL"));
		System.out.println(s1.endsWith("hel"));
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.endsWith("o"));

		System.out.println("-------");
		
		//.length()
		System.out.println(s4.length());  //spaces tho saha ani characters count chestundi

		System.out.println("-------");
		
		//.trim()
		System.out.println(s4.length());
		System.out.println(s4.trim());
		System.out.println(s4.trim().length());
		//leading and trailing spaces matram a potai, middle lo spaces povu.
		//leading antea starting.  trailing antea ending
		
		System.out.println("-------");
		
		//lowercase and uppercase
		System.out.println(s4.toLowerCase());
		System.out.println(s4.toUpperCase());
		System.out.println(s4.trim().toUpperCase());

		System.out.println("-------");
		
		//tocharArray
		char[] a = s1.toCharArray();
		/*
		 * debug mode lo chustea ardam aavutundi.
		 */

		System.out.println("-------");
		
		//.index()
		System.out.println(s4.indexOf("d"));  //echina character match itea index number estadi
		System.out.println(s4.indexOf("z"));  //echina character match kakapotea -1 number estadi
		System.out.println(s4.lastIndexOf("a"));  //repeated ga una characters lo last character index kava;i antea.

		System.out.println("-------");
		
		//.subString()
		System.out.println(s4.substring(5));
		System.out.println(s4.substring(5,9));

		System.out.println("-------");
		
		//.split()
		System.out.println(s4.split(" ")); //ekada error vastadi apudu kinda statement follow aavali.
		System.out.println(Arrays.toString(s4.split(" ")));
		System.out.println(s4.lastIndexOf("a"));  //repeated ga una characters lo last character index kava;i antea.

		System.out.println("-------");
		
		//.charAt()
		System.out.println(s4.charAt(5));
		System.out.println(s4.charAt(0));
		System.out.println(s4.charAt(4));
		System.out.println(s4.charAt(10));

		System.out.println("-------");
		
		//.replace()
		System.out.println(s4.replace("a", "b"));
		System.out.println(s4.replace("abdul", "baji"));

		System.out.println("-------");
		
		//.valueOf()
		String s5 = "200";
		int s6 = 123456;
		System.out.println(Integer.valueOf(s5)); //Convert string to value
//		System.out.println(Integer.valueOf(s1)); //java.lang.NumberFormatException vastadi
		System.out.println(String.valueOf(s6)); //Convert value to string 

		System.out.println("-------");
		
		//.isEmpty() and .isBlank()
		String s7;
		String s8 = "  ";
		String s9 = "";
//		System.out.println(s7.isEmpty());  //ekada error vastadi nduku antea manam a value evaleadu.
		System.out.println(s8.length());
		System.out.println(s8.isEmpty());
		System.out.println(s9.isBlank());
	}

}
