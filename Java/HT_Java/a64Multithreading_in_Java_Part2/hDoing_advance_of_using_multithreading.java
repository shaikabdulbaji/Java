package a64Multithreading_in_Java_Part2;

/*
 * manaki random ga vastundi kada output, vaka series lo u+output ravalanatea join() method use 
   chaiyali (or) vaka dani tarvata inkoti execute aavali antea join() method use chestamu.
   t1.join();
 * Thread aneadi kasepu agi start aavali antea t1.sleep(5000); e method use chestamu.
 */

public class hDoing_advance_of_using_multithreading {

	public static void main(String[] args) throws Exception {

		Runnable r1 = () -> {
			for(int i=0; i<10; i++) {
			System.out.println("Hi Employee "+Thread.currentThread().getName()+ " >> " + Thread.currentThread().getId());
			}
		};
			
		Thread t1 = new Thread(r1, "T1");
		t1.start();
		t1.sleep(5000);
		
		Runnable r2 = () -> {
			for(int i=0; i<20; i++) {
			System.out.println("Hi Manager "+Thread.currentThread().getName()+ " >> " + Thread.currentThread().getId());
			}
		};
					
		Thread t2 = new Thread(r2, "T2");
		t2.start();
		
	}
}
