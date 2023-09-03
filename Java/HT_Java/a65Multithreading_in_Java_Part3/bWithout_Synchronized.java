package a65Multithreading_in_Java_Part3;

public class bWithout_Synchronized {

	public static void main(String[] args) throws Exception {
		
		BrickDiry bd = new BrickDiry();

		Runnable r1 = () -> {
			for(int i=0; i<10000; i=i+50) {
				//Unloading 50 bricks
				bd.incrementBrickCount();
			}
		};
	
		Runnable r2 = () -> {
			for(int i=0; i<15000; i=i+50) {
				//Unloading 50 bricks
				bd.incrementBrickCount();
			}
		};
		
		Runnable r3 = () -> {
			for(int i=0; i<5000; i=i+50) {
				//Unloading 50 bricks
				bd.incrementBrickCount();
			}
		};
	
		Thread t1 = new Thread(r1);		
		Thread t2 = new Thread(r2);		
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		
		System.out.println(bd.brickCount);
		System.out.println(bd.brickCount1);
	}
}


class BrickDiry {

	int brickCount = 0;
	int brickCount1 = 0;
	
	public void incrementBrickCount() {
		
		brickCount = brickCount + 50;
		brickCount1 = brickCount1 + 50;
	}
	
}