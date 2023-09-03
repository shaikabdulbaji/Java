package a64Multithreading_in_Java_Part2;

public class fThird_way_of_using_multithread {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Hi Employee "+Thread.currentThread().getName()+ " >> " + Thread.currentThread().getId());
			}
		};
		Thread t1 = new Thread(r1, "T1");
		t1.start();
		
		Runnable r2 = new Runnable() {
			public void run() {
				System.out.println("Hi Manager "+Thread.currentThread().getName()+ " >> " + Thread.currentThread().getId());
			}
		};		
		Thread t2 = new Thread(r2, "T2");
		t2.start();
		
		System.out.println(Thread.activeCount());
	}
}
