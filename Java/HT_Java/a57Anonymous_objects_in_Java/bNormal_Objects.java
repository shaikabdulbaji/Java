package a57Anonymous_objects_in_Java;

/*
 * manam adana program ni execution start cheasinapudu stack area lo vaka stack aneadi create 
   aavutundi.
 * manam execution cheasinapudu vaka thread aneadi run aavutundi, for every thread 
   we have one stack. stack lopala em untai antea stack frames untai. each stack frame represents
   one method. 
 * for eg : manam main method aneadi execute chestnamu anuko daniki vaka stack frame aneadi
   allocate aavutundi. aa main method lopala local variables and reference variables untai.
   local variables antea manam method lopala create cheasea variables ani local variables a.
   manam amana object create chestea dani store chaiyataniki vaka variable use chestamu danea
   reference variables antamu. 
 * kinda program lo stu ani undi kada adea reference variable.
   stu anea variable of type student. i anea variable of type int.
   stu loki bStudent anea object store cheasukunam. stu anea variable bStudent anea object ni 
   reference chestundi anduku deni reference variable antamu.
   
 * Objects are always created in heap area.
 
 * kinda program lo
   bStudent stu;
   stu = new bStudent();
   stu --> Referenced variable
   bNormal_Objects; --> Referenced Object
   
   ekada stu anea reference undi kabati dani "Reference Variables" antamu, adea
   stu anea reference leakapotea dani "Anonumous Objects" antaru.
   
   for eg :
   manaki parents unaru kabati mana parents ni Reference Variables antamu, adea
   anada pillalaki parents undaru kabati mana aa pillalani ni Anonoumous Objects antatu.
 */

public class bNormal_Objects {
	
	String name = "shaik abdul";
	
	public void greet() {
		System.out.println("Hi "+name);
	}
	
	public static void main(String[] args) {
		
		int i = 10; //both declaration and initialization.
		
		int j; //declaration
		j = 20; //initialization
		
		bNormal_Objects stu;
		stu = new bNormal_Objects(); //stu loki bStudent anea object store cheasukunam.
		
		stu.greet();
		
	}

}
