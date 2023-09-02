package a62Lambda_expressions;

public class dBy_using_LambdaExpressions_with_returnType {
	
	public static void main(String[] args) {
		
		//Lambda expression with anonymous functions
		//3 components = arguments list, arrow token, function body.
		vehicle c1 = () -> {
			int speed = 80;
			System.out.println("Driving tata");
			System.out.println("Car speed at "+speed);
			if(speed>100)
				System.out.println("High speed ");
			else
				System.out.println("Low speed ");
			return speed;
		  };
		System.out.println(c1.getSpeed());
	}
}

@FunctionalInterface
interface vehicle {
	public int getSpeed();
}