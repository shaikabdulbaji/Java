package a59Inner_classes_Part1;

public class gTestClass6 {
	
	private int id =100;
	
	public static void main(String[] args) {
		
		System.out.println("Main Method : TestClass-6");
		fTestClass4 tc4 = new gTestClass6().new fTestClass4();
		tc4.show();
	
	}
	
	public class fTestClass4 {
		
		private int id =101;

		public void show() {
			int id = 102;
			System.out.println(id);
			System.out.println(this.id);
			System.out.println(gTestClass6.this.id);
			
		}
		
		public void add() {
			
			fTestClass4 tc4 = new fTestClass4();
			
		}
	}
}




