package a44qJavaBean_Class;

public class bProgram {

	public static void main(String[] args) {

		cEmployee emp = new cEmployee();
		emp.setId(20);
		emp.setName("abdul");
		emp.setSalary(20000.00);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		cEmployee emp1 = new cEmployee();
		emp1.setId(21);
		emp1.setName("abdul1");
		emp1.setSalary(21000.00);
		
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		
		cEmployee emp2 = new cEmployee();
		emp2.setId(22);
		emp2.setName("abdul2");
		emp2.setSalary(22000.00);
		
		System.out.println(emp2.getId());
		System.out.println(emp2.getName());
		System.out.println(emp2.getSalary());
		
		cEmployee emp3 = new cEmployee();
		emp3.setId(23);
		emp3.setName("abdul3");
		emp3.setSalary(23000.00);
		
		System.out.println(emp3.getId());
		System.out.println(emp3.getName());
		System.out.println(emp3.getSalary());
		
		cEmployee[] e = new cEmployee[] {emp, emp1, emp2, emp3};
		
		for(cEmployee em : e) {
			System.out.println(em);
		}
	}

}
