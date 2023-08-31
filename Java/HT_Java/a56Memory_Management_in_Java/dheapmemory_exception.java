package a56Memory_Management_in_Java;

/*
 * ekada vaka program rasi manam heap area yoka memory full cheasi chudam em exception vastundo.
 * heap aneadi full itea e exception vastadi 
   Exception in thread "main" java.lang.OutOfMemoryError: Java heap space.
   
 * deni memory increase cheasi run chaiyalia antea editor meda right click echi run as loki velli
   run configurations pai click cheasi vaka box open iedi danilo arguments pai click cheasi vm
   arguments ani vaka text box untadi andulo e below command evali.
   -Xmx500m -- 500mb memory increase chaiyali antea.
   -Xmx100m -- 100mb memory increase chaiyali antea.
   -Xmx1000m -- 1000mb memory increase chaiyali antea.
 */

public class dheapmemory_exception {

	public static void main(String[] args) {

		int size = 10;
		for(int i=0; i<Integer.MAX_VALUE; i++) {
			int[] arr = new int[size];
			size = size*2;
			System.out.println(size);
		}
	}
}
