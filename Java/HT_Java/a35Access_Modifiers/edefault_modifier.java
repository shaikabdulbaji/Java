package a35Access_Modifiers;

class edefault_modifier {

	int rollNo = 101;
	
	//constructor
	edefault_modifier() {
		rollNo = 102;
	}
	
	//method
	void printRollNumber() {
		System.out.println(rollNo);
	}
	
	//main method
	public static void main(String[] args) {

		edefault_modifier edm = new edefault_modifier();
		System.out.println(edm.rollNo);
	}
	
	public void abc() {
		printRollNumber();
	}

}
