package a40Exception_Handling_Part2_43;

/*
 * manam custom or customize exceptions kuda throw chaiyavachu.
 */

public class dcustomize_exception {

	public static void main(String[] args) {

		try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Stupid Fellow, don't divide number with zero");
		}
		
		
	}

}
