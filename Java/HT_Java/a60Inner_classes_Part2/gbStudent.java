package a60Inner_classes_Part2;

/*
 * gaStudent or gbStudent e rentilo ado vakati vadukuntea saripodi.
 */

public class gbStudent {
	
	public static void main(String[] args) {
		
		gStudent s = new class10();	
		s.attend();
		s.getMarks();
	}
	
}

class class10 implements gStudent {

	@Override
	public void attend() {
		System.out.println("Attend is Called");		
	}

	@Override
	public void getMarks() {
		System.out.println("getMarks is Called");		
	}
	
}
	
