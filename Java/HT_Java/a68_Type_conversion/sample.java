package a68_Type_conversion;


/*
 * manaki java lo type conversion (or) type casting aneadi chala important, mostly evirendu same a
 * e renditi madya difference amiti antea :
   Type Conversion --> Primitive data ni convert cheaseadani "Type conversion" antamu.
   Type Casting --> Non-primitive data ni convert cheaseadani "Type Casting" antamu.
   
 * e type conversion lo two types untai :
   1. Implicit conversion (or) Automatic conversion (or) widening (or) upcasting.
   	  e "implicit wait" lo mana involvement aavasaram leadu java nea convert cheasukuntadi nduku antea
   	  pedha value lo china value petatamea kabati.
   	  
   2. Explicit conversion (or) Manual conversion (or) narrowing (or) downcasting.
   	  e "wcplicit wait" lo mana involvement aavasaram nduku antea china value lo pedha value
   	  petatali kabati, edi aavani pani anduku manam involve aavutamu ela chaie ani.
 */


public class sample {

	public static void main(String[] args) {

		byte b = 10; // -128 to 127 = 256
		short s = 50;
		int i = 25;
		float f = 21.1f;
		long l = 23456789;
		double d = 22.33;
		
		char c = 'A';
		boolean ab = true;
		
		//Implicit Wait (edi automatic ga jargidi due to pedha value lo chinna value petatam a kabati)
//		s=b;
//		System.out.println(s);
//		i=b;
//		System.out.println(i);
//		f=b;
//		System.out.println(f);
//		l=b;
//		System.out.println(l);
//		d=b;
//		System.out.println(d);
		
//		d=i;
//		System.out.println(d);
//		d=s;
//		System.out.println(d);
		
		
		//Explicit Wait (edi automatic ga jargadu due to chinna value lo pedha value petatali kabati)
		
//		b = (byte)s;
//		System.out.println(b);
//		b = (byte)i;
//		System.out.println(b);
//		s = (short)i;
//		System.out.println(s);
		
		b = (byte)i;
//		System.out.println(b); //vaka vella int i=300; itea answer is 44 byte total 256-300=44.
//		System.out.println(b);
		/*
		 * vaka vela int i=128; itea answer is -128. nduku antea 0,1,2....127,-128,-127.....-0.
		 * adea vaka vela int i=256; itea answer is 0. ndukantea antea 0,1,2....127,-128,-127.....-0
		   127+(-127)=0.
		 * adea vaka vela int i=257; itea answer is 1. ndukantea antea 0,1,2....127,-128,-127.....-0
		   256-257=1.
		 * vaka vela int i=25; itea answer is 25, nduku antea inte value byte range ni cross 
		   chaiyaleadu vaka veala value range cross itea paina chupinchinatu ga manuplation jargutundi.
		 */
		
		//boolean value ni paina una a dataType ki cast chaiyaleamu and viceversa like below example.
//		b = (byte) ab;  //Cannot cast from boolean to byte
//		ab = (boolean) b;  //Cannot cast from byte to boolean
		
//		byte b2 = b+b; //deni Automatic Type promotion antaru.
		int b2 = b+b; //paina ine error vastadi kani edi radu low vi high  ki assign chaiyali.
		
//		int i2 = i+i+l; //edi error vastadi
		long i2 = i+i+l;
		
		
		System.out.println('A'+'B'); //edi concatinate aavadu a+b=65+66=131.
		System.out.println("A"+"B"); //edi concatinate iedi.
		
	}

}
