package a44POJO_Class;

public class cEmployee {
	
	/*
	 * variable ki private a petali ani rule em leadu adi just recommendation matramea.
	 
	 * Rules for a class to be called as POJO class 
	 1. It must be public.
	 2. It is recommended to make the properties (instance variables) as private for improved security.
	 3. It can have Getters & Setters in order to access properties.
	 4. It should not implement any interfaces.
	 5. It should not extend any classes
	 6. It should not have annotations specified.
	 7. Mostly main method was not there in POJO classes.
	 */
	
	private int id;
	public String name;
	protected double salary;
	
	public cEmployee() {
		System.out.println("No args consttructor");
	}
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
