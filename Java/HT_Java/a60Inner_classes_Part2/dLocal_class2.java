package a60Inner_classes_Part2;

public class dLocal_class2 {
	
	public static void main(String[] args) {
		
		int id = 100;
		int salary = 10000;

		//e local classes ni class ki bayata access chaiyaleamu.
		if(5<6) {
			class A {
				public void print() {
					System.out.println("Salary is "+salary);
				}	
			}
			
			A a = new A();
			a.print();
		}
	}
	
	public void show() {
		System.out.println("Show Method is Called");
	}
}
