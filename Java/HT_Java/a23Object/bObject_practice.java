package a23Object;

public class bObject_practice {
	
	int i;
	int j;
	
	public bObject_practice() {
		i = 10;
		j = 20;
	}
	
	public bObject_practice(int i, int j) {
		this.i = i; 
		/*
		 * ekada this nduku vadamu antea adi class level variables ki redirect chaiyataniki vadamu
		   adea this aneadi lekapotea method level variables or parameters ki redirect aavutundi.
		 */
		this.j = j;
	}

	public static void main(String[] args) {

		bObject_practice op1 = new bObject_practice();      //30
		/*
		 * ekada 30 ani nduku print iendi antea edi default constructor tisukuntundi akada manam
		   em values evatla. i,j nea unai avi add cheasi print cheasidi.
		 */
		bObject_practice op2 = new bObject_practice(20,30); //50
		bObject_practice op3 = new bObject_practice(25,35); //60
		/*
		 * ekada 50 and 60 ani nduku print ienai antea edi parameterized constructor tisukuntundi 
		   akada manam class level veariables ni assign chestunam. i,j nea unai avi add cheasi 
		   print cheasidi.
		 */
		
		System.out.println(op1.add());
		System.out.println(op2.add());
		System.out.println(op3.add());
	}
	
	public int add() {
		
		return i+j;
	}

}
