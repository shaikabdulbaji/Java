package a64Multithreading_in_Java_Part2;

public class cCreating_of_multithread {

	public static void main(String[] args) {

		Thread t = new Thread();
		t.start();
		
		Thread t1 = new Thread();
		t1.start();
		
		Thread t2 = new Thread();
		t2.start();
		
		Thread t3 = new Thread();
		t3.start();
		
		Thread t4 = new Thread();
		t4.start();
		
		System.out.println(Thread.activeCount());
	}

}

/*
 * ekada thread ni ala create chestamu and ala run chestamu antea 
   Thread t = new Thread(); --> e statement thread create chaiyataniki use aavutundi.
   t.start(); --> e statement aa create ina thread run (or) start aavataniki use aavutundi.
   Thread.activeCount() --> e statement ani threads aneadi active lo unaiyao chupistundi.
   vako sari active lo 2 undochu or 3 undochu or 4 undochu or 5 undochu or 1 undochu.
 */
