package a22Constructor;

public class fMemory_allocation_for_parameterized_constructors {
	
	public int i;
	
	public static void main(String[] args) {
		
		fMemory_allocation_for_parameterized_constructors ec = new fMemory_allocation_for_parameterized_constructors(85);
		System.out.println(ec.i);
		
	}
	
	public  fMemory_allocation_for_parameterized_constructors() {
		
		i = 20;
		/*
		 * manam ado vaka parameter value constructor creat cheasina tarvta estea manam ani sarlu
		   call cheasina aa constructor creat cheasina tarvta echina value a vastundi.
		 */
	}
	
	public  fMemory_allocation_for_parameterized_constructors(int a) {
		
		i = a;
		/*
		 * adea manam constructor create cheasea tapudu parameter estea manam a value estea aa 
		   value print iedi.
		 * nenu constructor create cheasea tapudu 85 ani echanu adi 20 ni override cheastundi.
		   manam 85 kadu a valueestea aa value print iedi, adi parameterized constructor yoka
		   gopathanam.
		 */
		
	}

}
