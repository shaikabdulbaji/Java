package a36Interface_Part1;

/*
 * Defined or unimplemented methods are known as "abstract methods".
 */


public interface bLaptop {
	
	public void copy();
	
	public void paste();
	
	public void cut();
	
	public void keybord();
	
	/*
	 ** Untill Java-7
	 * manam paina koni methods define chesamu vatiki implementation ekada kakunda vaka seperate
	   class create cheasi akada e interface akada implement cheasi vati implementation methods rastamu.
	   manam incase amana kotha method rayali antea e interface lo rastea error vastadi. motham create 
	   cheasina classes ki error vachi distrub aavutai.
	   
	   dini overcome chaiyatniki vaka kotha method introduce cheasaru from java-7.
	   
	 * manam amana method define cheaseatapudu a access modifier ina evachu. paina problem overcome 
	   chaiyataniki two options echaru access modifier ga "default and static" evachu apudu vatiki
	   implementation ekada interface lo evachu.
	 * default aneadi class lo rayaleamu interfaces lo rayagalamu.
	 * implementation aneadi below chudandi.
	 
	 * but default ki and static ki difference entantea :
	   default echinapudu manam aa method ni call chaiyali antea object create cheasi apudu call chaiyali.
	   adea static itea direct ga main method lo class name echi method name estea saripodi.
	   
	 * paina chepukuna default and static aneavi java-7 tarvata work cheasinai anataniki proof.
	 * project pai right click echi properties pai click cheasi java compiler loki velli 1.8 ani set chestea
	   telisidi aa difference.
	 * from 1.9 nunchi private kuda work aavutundi. 
	 */
	
	default void security() {
		message();
		music();
		System.out.println("Please implement");
	}
	
	static void audio() {
//		messge(); // non-static static loki call chaiyaleamu ala avali antea object create cheasi call chaiyali.
		music();
		System.out.println("Laptop Audio Code");
	}
	
	private void message() {
		System.out.println("Please implement message");
		music();
	}
	
	private static void  music() {
//		messge(); // non-static static loki call chaiyaleamu ala avali antea object create cheasi call chaiyali.
		System.out.println("Please implement music");
	}
}
