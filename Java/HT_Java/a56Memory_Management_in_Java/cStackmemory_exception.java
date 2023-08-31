package a56Memory_Management_in_Java;

/*
 * recurssion antea vakatea method repeated ga execute iedi.
 * ekada recurssion use cheasi manam stack area yoka memory full cheasi chudam em exception 
   vastundo ani.
 * stack aneadi full itea e exception vastadi 
   Exception in thread "main" java.lang.StackOverflowError.
   
 * deni memory increase cheasi run chaiyalia antea editor meda right click echi run as loki velli
   run configurations pai click cheasi vaka box open iedi danilo arguments pai click cheasi vm
   arguments ani vaka text box untadi andulo e below command evali.
   -Xss2m -- 2mb memory increase chaiyali antea.
   -Xss5m -- 5mb memory increase chaiyali antea.
   -Xss10m -- 10mb memory increase chaiyali antea.
 */

public class cStackmemory_exception {

	public static void main(String[] args) {

		new cStackmemory_exception().add(1);
		
	}

	public void add(int i) {
		System.out.println(i);
		i++;
		add(i);
	}
}
