package a30String;

public class bString_Creation {

	public static void main(String[] args) {

		int i=10;
		
		//first way of creating string
		String s1 = "shaik baji";
		String s2 = "shaikabdul123@gmail.com"; //allows alpha numerics
		
		System.out.println(s1);
		System.out.println(s2);
		
		//Concatenation
		System.out.println(s1 + s2);
		
		//second way of creating string
		String s3 = new String("shaik abdul baji");
		System.out.println(s3);
		
		bString_Creation t1 = new bString_Creation();
		System.out.println(t1);  //hash code print cheasidi
		
		/*
		 * s1 or s2 or s3 ekadina strings medha cursor peti f3 press chaiyandi apudu adi vaka class 
		   ki redirect iedi adea string class.
		 * i pakana int undi dani medha cursor peti f3 press chaiyandi no response.
		 
		 * s3 and t1 both are objects but t1 prints hash code and s3 prints given text.
		 * That's why we call string as literal.
		 */
	}

}
