package a36Interface_Part2_61;

public class dUser {

	public static void main(String[] args) {

//		bCar car = new bCar();  
		/*
		 * functional interface ki object create chaiyaleamu dini overcome chaiyataniki anonymous classes
		   use chestamu.
		 */
		
		bCar car = new bCar() 
		{
			@Override
			public void drive() {
				System.out.println("Drive is Called");
			}
			
		};
		car.drive();
	}

}
