package a36Interface_Part1;

public class cHP implements bLaptop{
	
	@Override
	public void copy() {
		System.out.println("HP copy code");		
	}

	@Override
	public void paste() {
		System.out.println("HP paste code");				
	}

	@Override
	public void cut() {
		System.out.println("HP cut code");				
	}

	@Override
	public void keybord() {
		System.out.println("HP keybord code");				
	}
	
	public void printing() {
		System.out.println("HP printing code");
	}

}
