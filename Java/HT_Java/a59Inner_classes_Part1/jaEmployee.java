package a59Inner_classes_Part1;

public class jaEmployee {
	
	private int id =100;
	
	public static void main(String[] args) {
		
		System.out.println("Main Method : TestClass-6");
		fTestClass4 tc4 = new jaEmployee().new fTestClass4();
		tc4.show();
		System.out.println(tc4.getEmployeeId());
		tc4.caluclateSalary();
	}
	
	public class fTestClass4 implements jEmployee{
		
		private int id =101;

		public void show() {
			int id = 102;
		}
		
		public void add() {
			
			fTestClass4 tc4 = new fTestClass4();
			
		}
	

		@Override
		public int getEmployeeId() {
			return id;
		}

		@Override
		public void caluclateSalary() {
			System.out.println("Salary is 1Lakh");			
		}
	}
}




