package a62Lambda_expressions;

public class aNormal_Interface {
	
	public static void main(String[] args) {
		Audi a = new Audi();
		a.drive();
	}
}

class Audi implements Car {
	@Override
	public void drive() {
		System.out.println("Driving Audi");
	}	
}

@FunctionalInterface
interface Car {
	public void drive();
}