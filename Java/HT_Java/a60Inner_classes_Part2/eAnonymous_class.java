package a60Inner_classes_Part2;

/*
  class1 c1 = new class1() {
			public void print() {
				System.out.println("Updated Print Method is Called");
			}
		};
		
		{
			public void print() {
				System.out.println("Updated Print Method is Called");
			}
		};
		e pain statement kuda class a deniki amana name undha andukea deni anonymous class antaru.
 */

public class eAnonymous_class {
	
	public static void main(String[] args) {
		
		int id = 100;
		int salary = 10000;

		class1 c1 = new class1() {
			public void print() {
				System.out.println("Updated Print Method is Called");
			}
		};
		c1.show();
		c1.print();
	}
	
}	
	
class class1 {
		
	public void show() {
		System.out.println("Show Method is Called");
	}
		
	public void print() {
		System.out.println("Print Method is Called");
	}
}

class class2 extends class1 {
	
	public void print() {
		System.out.println("Updated Print Method is Called");
	}
	
}
