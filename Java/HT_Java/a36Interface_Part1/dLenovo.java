package a36Interface_Part1;

public class dLenovo implements bLaptop{

	@Override
	public void copy() {
		System.out.println("Lenovo copy code");		
	}

	@Override
	public void paste() {
		System.out.println("Lenovo paste code");				
	}

	@Override
	public void cut() {
		System.out.println("Lenovo cut code");				
	}

	@Override
	public void keybord() {
		System.out.println("Lenovo keybord code");				
	}
	
	/*
	 * "@Override" aneadi optional undocu vundakapovachu. metod aneadi compulsory undali 
	   leakapotea error vastadi.
	 * mandatory methods undali but additional methods kuda create cheasukovachu. aa mandatory methods
	   lo vaka method miss ina error vastadi.
	 */
	
	public void camera() {
		System.out.println("Lenovo camera code");
	}
	
	public void security() {
		System.out.println("Lenovo security code");
	}

}
