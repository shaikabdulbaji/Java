package a59Inner_classes_Part1;

public class iaStudent {
	
	private int id =100;
	
	public static void main(String[] args) {
		
		System.out.println("Main Method : TestClass-6");
		fTestClass4 tc4 = new iaStudent().new fTestClass4();
		tc4.show();
	
	}
	
	public class fTestClass4 extends iStudent{
		
		private int id =101;

		public void show() {
			int id = 102;
			System.out.println(id);
			System.out.println(this.id);
			System.out.println(iaStudent.this.id);
			System.out.println(getMarks());
			giveExam();
		}
		
		public void add() {
			
			fTestClass4 tc4 = new fTestClass4();
			
		}
		
		//ekada override anea annotation petina petakapoina pedha differ em leadu, only mana gurthu kosam.
		public int getMarks() {
			return 777;
		}

		@Override
		public void giveExam() {

			System.out.println("Given Exam");
		}
	}
}




