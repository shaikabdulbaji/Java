package a30String;

public class cComparision_Of_Strings {

	public static void main(String[] args) {
		
		String s1 = "shaik baji";
		String s2 = new String("shaik baji");
		String s3 = "shaik baji";
		String s4 = new String("shaik baji");

		System.out.println(s1==s2); //s1 and s2 both are not equal		
		System.out.println(s2==s3); //s2 and s3 both are not equal
		System.out.println(s1==s3); //s1 and s3 both are equal
		System.out.println(s2==s4); //s2 and s4 both are not equal
		
		System.out.println("-----------------------");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		
		/*
		 * == edi addresses ni compare chestundi.
		 * .equals() edi lopal una content ni compare chestundi.
		 
		 * Mostly recommended method is .equals() method.
		 */
		
		/*
		 * String ani vaka pic attach cheasanu aa package kinda aa pic lo chala clarity ga undi.
		 * new anea keyword tho string create chestea heap memeory loki veltundi, normal ga 
		   create chestea scp(String constant pool) loki veltundi.
		 * inka vati comparision paina chesamu chudandi.
		 */
	}

}
