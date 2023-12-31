package a31Static_and_nonstatic;

import java.util.Random;

public class bTest1 {
	
	static int number;
	
	/*
	 * static keyword echi vakasari evakunda vakasari print chaiyandi difference telsidi.
	 * paina una int number; static anea keyword leakapotea manam object create cheasi dani 
	   call chestamu.
	 * vaka veala static int number; static untea danikiobject tho pani leadu direct ga
	   classname.variablename estaea saripotundi.
	 */
	
	public static void main(String[] args) {
		
		bTest1 t1 = new bTest1();
		t1.number = new Random().nextInt();
		
		bTest1 t2 = new bTest1();
		t2.number = new Random().nextInt();
		
		bTest1 t3 = new bTest1();
		t3.number = new Random().nextInt();
		
		System.out.println(t1.number);
		System.out.println(t2.number);
		System.out.println(t3.number);
		
		/*
		 * static anea keyword leakapotea manam object create cheasi dani call chestamu. aa object a 
		   vidam ga call chestea aa vidam ga print iedi. ekada three objects unai kabati 3 types lo
		   value print iedi. antea vaka dani override cheasi inkto ala.
		 */
		
		System.out.println("-----------");
		
		System.out.println(bTest1.number);
		
		/*
		 * static untea danikiobject tho pani leadu direct ga classname.variablename estaea saripotundi.
		   manam ani objects create cheasina static anea keyword estea adi constant value la ani objects
		   tisukoni print chestai. 
		 */
	}
	
	public static void print1() {
		System.out.println(" Static Method");
	}
	
	public void print2() {
		System.out.println(" Non-Static Method");
	}

}
