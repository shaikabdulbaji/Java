package a64Multithreading_in_Java_Part2;

/*
 * manam first way lo Thread anea class ni extend cheasamu. epudu second way lo Runnable anea 
   interface ni implements chestamu. and aa Runnable interface lo start() anea method undadu.
   apudu manam ala run chestamu antea malli vaka thread create cheasi aa thread e runnable yoka
   reference variable estamu. and T1 echamu kada antea name kuda cheasukovachu.
   
 * manam e second way ni nduku use chestamu, vakati undaga inkoti nduku antea.
   first way to extends use cheasamu, second way lo implements use cheasamu.
   extends use cheasinapudu manukoni problems untai avi entantea multiple inheritance work aavadu, adea
   implements use chestea manaki multiple inheritance use cheasukovachu.
   and implements use chaiyatam valla use entantea manaki amana class kavalana extend cheasukovachu
   and muliple interfaces kuda use cheasukovachu.
   for eg :
   1. extends Thread
   2. implements Runnable
   3. extends Thread implements Runnable
   4. extends Thread implements Runnable,interface2
 */

public class eSecond_way_of_using_multithread {

	public static void main(String[] args) {

		Student stu = new Student();
		Thread t1 = new Thread(stu, "T1");
		t1.start();
		
		Teacher tea = new Teacher();
		Thread t2 = new Thread(tea, "T2");
		t2.start();
		
		System.out.println(Thread.activeCount());
	}
}

class Student implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Hi Employee "+Thread.currentThread().getName()+ " >> " + Thread.currentThread().getId());
	}
}

class Teacher implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Hi Manager "+Thread.currentThread().getName() + " >> " + Thread.currentThread().getId());
	}
}


