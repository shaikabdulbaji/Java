package a62Lambda_expressions;

public class bBy_using_AnonymousClasses {
	
	public static void main(String[] args) {
		Car c = new Car() 
		{
			public void drive() {
				System.out.println("Driving BMW");
			}
		};
		c.drive();
	}
}

@FunctionalInterface
interface cycle {
	public void drive();
}