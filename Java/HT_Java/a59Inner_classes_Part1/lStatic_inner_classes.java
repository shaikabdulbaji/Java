package a59Inner_classes_Part1;

public class lStatic_inner_classes {
		
	public static void main(String[] args) {
		
		System.out.println("Main Method : TestClass-6");
		
		fTestClass5 tc5 = new lStatic_inner_classes.fTestClass5();
		tc5.abc();
	}
	
	public class fTestClass4 {
	
	}
	
	public static class fTestClass5 {
			
			public void abc() {
				System.out.println("abc");
			}
			
		}
	}	





