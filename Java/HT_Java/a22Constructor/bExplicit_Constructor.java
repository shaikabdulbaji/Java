package a22Constructor;

/*
 * Where we use constructors?
 * bExplicit_Constructor = class name
   cp = variable 
   = : assignmen operator
   new = keyword
   bExplicit_Constructor() = Constructor.
   
   class name ki constructor ki difference "()" or paranthasis.
   
 * Constructor ni manamu object create cheaseatapud call chestamu.
   
 */

/*
 * Why we use constructors?
 * adana class ki memory allocate chaiyataniki object ni create chestamu.
 * class ki memory allocate chaiyatam antea indirect ga variables ki methods ki memory
   allocate cheasinatu.
 * variables ki methods ki memory allocate cheastunamu antea internal ga  or java lo ado 
   vaka operation jargutundi.
 * aa memory allocation chaiyatniki jarigea operations ani constructors lo chestam ana mata.
  
 Note:
 * Manam constructor ni create chaiyakapotea default ga java default contructor create chestundi.
   default constructor (or) implicit constructor both are same.
 */

/*
 * Rules of Constructor :
 * //default constructor
	public  bConstructorPractice() {
		
	}7*5\4
   1. Constructor name is same as class name.
   2. Constructors ki return type (or) void undadu. manam constructors lo adi return chaiyamu.
   3. default constructors apudu public ganea untai. default kabati public undi leakapotea mana 
      estam adainaa petukovachu access modiifier aneadi. 
 */

public class bExplicit_Constructor {
	
	public static void main(String[] args) {
		
		bExplicit_Constructor cp = new bExplicit_Constructor();
			
	}
	
	/*
	 * manam adina constructor estea dani explicit constructor antaru leakapotea implicit constructor 
	   antaru.
	 * manaki default constructor leadu anuko manam bExplicit_Constructor() pai click cheasi "fn+f3"
	   press chestea adi class name ki redirect aavutundi.
	 * manaki default constructor undi anuko manam bExplicit_Constructor() pai click cheasi "fn+f3"
	   press chestea adi aa default constructor ki redirect aavutundi.
	 */
	
	//explicit constructor
	public  bExplicit_Constructor() {
		
	}

}
