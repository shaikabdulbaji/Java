package a35Access_Modifiers;

public class fprotected_modifier {

	protected int rollNo = 101;
	
	//constructor
	protected fprotected_modifier() {
		rollNo = 102;
	}
	
	//method
	protected void printRollNumber() {
		System.out.println(rollNo);
	}
	
	//main method
	public static void main(String[] args) {

		fprotected_modifier epm = new fprotected_modifier();
		System.out.println(epm.rollNo);
	}
	
	public void abc() {
		printRollNumber();
	}

}
