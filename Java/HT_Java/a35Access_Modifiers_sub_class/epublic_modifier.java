package a35Access_Modifiers_sub_class;

import a35Access_Modifiers.bpublic_modifier;

public class epublic_modifier extends bpublic_modifier{

	public static void main(String[] args) {

		new epublic_modifier().test();
		
	}
	
	public void test() {
		System.out.println(rollNo);
		printRollNumber();
		
	}

}
