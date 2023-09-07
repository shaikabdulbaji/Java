package a66StingBuffer_and_StringBuilder;

public class bString {

	public static void main(String[] args) {

		String s1 = "abdul";//23
		System.out.println(s1);
		String s2 = "abdul";//23
		System.out.println(s1==s2);
		
		s1 = s1 + "shaik";//36
		System.out.println(s1);
		System.out.println(s1==s2);
		
		String s3 = "shaik baji";//39
		System.out.println(s1==s3);
		
		
	}

}
