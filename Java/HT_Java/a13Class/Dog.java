package a13Class;

	/*
	 * package a13Class;
	 * manki class aneadi a package lo undi ani teliyataniki e pai statement
	 */

public class Dog {
	
	/*
	 * public class Dog { 
	 * ekada public is optional undochu or undakapovachu.
	 * public tiseasina panichestundi.
	 * public antea mana class ni andaru chudochu ani ardam, private antea privacy.
	 */
	
	public String breed = "German Shepad";
	public int height = 30;
	public int weight = 100;
	
	/*
	 * paina breed, height, weight evi mudu bayata real world lo properties but ekada java lo variables antamu.
	 */
	
	public static void main(String[] args) {
		
		/*
		 * public static void main(String[] args) {
		 * public tiseasina manaku program run aavadu
		 * static tiseasina manaku program run aavadu 
		 * main tiseasina manaku program run aavadu
		 */
		
		System.out.println("Test");
		
		/*
		 * manam epudu bayata una variables ni call chaiyali main method lo antea object create chestamu aa object
		   kuda ala create chestamu class name tho create chestamu, object name is same as class name.
		 */
		
		//Object is the super class for every class in java.
		
		Dog dog = new Dog();
		System.out.println(dog.breed);
		
		
		/*
		 * Class is a blueprint which contains variables and methods information.
		 * memebers of class are variables and methods.
		 */
		
	}

}
