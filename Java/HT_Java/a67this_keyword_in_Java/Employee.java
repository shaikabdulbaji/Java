package a67this_keyword_in_Java;

/*
 * In the world of Java programming, the "this" keyword plays an important role in differentiating 
   instance variables from local variables and avoiding ambiguity. In this video, we unravel the 
   significance and applications of "this" keyword. 
   
 * "this" keyword acts as a reference to the current object, enabling smooth interaction with instance 
   variables within constructors, methods, and even in the context of method chaining. "this" also 
   enhances the code readability.
   
 * package or public or class evani vaka lanti pink colour lo unai kada evi "reserved keyword".
   elanti reserved keywords ni className or packageName or object reference name or variableName 
   elanti vatiki use chaiyakudadu. nduku antea viti functionality already define cheasi petaru java 
   lo anduku ani viti manam ekada use chaiyaleamu.
   
 * "this" aneadi vaka special keyword nothing but reserved keyword.
 
 * manam instance variable ni access chaiyatam kosam "this" anea keyword ni introduce cheasaru java lo.
   instance variables antea enti manam class level lo koni non-static variables ni echi untamu vatini
   instance variables antamu.
   vitini instance variable ani nduku antamu, class ki instance create cheasimatramea outside ki access
   chaiyagalamu.
   
 * int age = 25;
   int age = 55;
   evi rendi vaka chota petaleamu error vastadi.
  
 * kani "this" aneakeyword ki koni limitations unai avi amiti antea non-static methods/blocks and 
   constructors and abstract classes and interfaces only vitilonea manam "this" anea keyword use 
   chestamu.
   
 * manam "this" anea keyword static blocks lo use chestea e error vastadi "Cannot use this in a 
   static context".
   
 * manaki output lo25 aneadi 3 times print iendi nduku antea non-static block ni execute cheasinapudu
   ani sarlu object untea ani sarlu output print ied.
*/

public class Employee {
	
	int age = 25; //deni scope only e class varikea untadi
	
	public Employee() { //edi constructor
		System.out.println(this.age);
	}
	
	public static void main(String[] args) {

		//this.age = 100;
		
		Employee e = new Employee();
		e.setAge(45);
		System.out.println(e.getAge());
		
		Employee e1 = new Employee();
		e1.setAge(55);
		System.out.println(e1.getAge());
		
		Employee e2 = new Employee();
		e2.setAge(65);
		System.out.println(e2.getAge());
		
		this_in_abstract th = new this_in_abstract() {
			
			@Override
			public void driveCar() {

				
			}
		};
		
		th.setCarName("BMW");
		System.out.println(th.getCarName());
	}
	
	public int getAge() {
		
		//int age = 55; //deni scope only e method varikea untadi
		
		return age;
	}
	
	public int setAge(int age) {
		
		this.age = age;
		
		return age;
	}
	
	{
		System.out.println(this.age);
	}

}
