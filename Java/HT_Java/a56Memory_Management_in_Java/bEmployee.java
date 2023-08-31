package a56Memory_Management_in_Java;

/*
 * adaina program run avali anea thread kavali.
 * prathi vaka thread ki vaka stack aneadi create aavutundi.
 * manaki ani threads untea ani stacks untai.
 * stack lopala koni frames untai vatini stack frames antamu.
 * heap area is ROM and stack area is like RAM.
 * stack area yoka performance is high, heap area yoka performance is low.
 * default size of stack area is 1024kb=1mb and default size of heap area is 786mb.
 */

public class bEmployee {
	
	int orgId = 454;
	String orgName = "livetech";
	String ceo = "abdul";
	int noofDepartment = 2;
	static double netWorth = 500.00;

	public static void main(String[] args) {
		
		int empId = 101;
		String empName = "baji";
		double salary = 5000;
		
		bEmployee e1 = new bEmployee();
		e1.getorgId();
		e1.getNetWorth();
		e1.deleteEmpoyee(101);
		
		bEmployee e2 = new bEmployee();
		e1.getorgId();
		System.out.println(bEmployee.getNetWorth());
		e2.deleteEmpoyee(101);
	}

	public int getorgId() {	return orgId; }
	
	public static double getNetWorth() { return netWorth; }
	
	public void deleteEmpoyee(int empId) {
		//code
	}
}
