package a35Access_Modifiers;

/*
 * Objects can't be created for abstract class, we have to create a sub-class and access its 
   variables/methods using sub-class object reference. 
   
 variables:
 ---------
 * variables can't be specified with 'abstract' non-access modifier.
 * variables ki abstract vadaleamu adi illegal --> Illegal modifier for the field company; 
   only public, protected, private, static, final, transient & volatile are permitted.
 
 methods:
 -------
 * On specifying a method with abstract modifier, we can just declare the method without implementing
   it.
 * adana vaka method ki manam abstract ani peditea error chupistadi class ki abstract petamani warning
   chupistadi, atleast vaka method ki abstract untea class ki kuda abstract petali and tarvata ani ina
   non-abstract methods undochu em kadu.
 * manam ekada adana method ki abstract petamu anuko dani manam implementation chaiyali antea verea
   class vakati create cheasi akada unimplemented methods ni implement cheasukovachu.
 * manam abstract class ki object create chaiyaleamu, manam verea child class create cheasi akada 
   implement cheasi untamu kada methods. aa child class ki object create cheasi dani nunchi ani access 
   cheasukovachu.
 * manam adana method ki abstract ani peditea daniki body undadkudadu.
   
 classes:
 -------
 * classes having at-least one abstract specified method must be specifiedas abstract.
 
 sub-classes:
 -----------
 * sub-class inheriting the super-class need to implement the abstarct specified methods in 
   super-class.
   purpose of abstract-methods : used when the super-class dont have to implement everything and
   when the sub-class needs to implement them.
 
 
 */

public abstract class habstract_non_access_modifier {
	
	//abstract String company;
	String company;
	
	public abstract void startCar(); 
	
	public void stopCar() {
		System.out.println("Car Stopped");
	}

}
