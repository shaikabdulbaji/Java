package a60Inner_classes_Part2;

public class cLocal_class1 {
	
	public static void main(String[] args) {
		
		int id = 100;
		int salary = 10000;

		class A {
			public void print() {
				System.out.println("Salary is "+salary);
			}	
		}
		
		A a = new A();
		a.print();
	}
	
	public void show() {
		System.out.println("Show Method is Called");
	}
}
