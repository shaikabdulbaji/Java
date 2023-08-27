package a16Methods;

public class bBank {
	
	static int currentBalance = 1000;
	
	public void deposit(int amount){
			
			currentBalance = currentBalance + amount;
			System.out.println("Amount is deposited Successfully");
		}
	
	public static void withdrawl(int amount){
		
		currentBalance = currentBalance - amount;
		System.out.println("Amount is withdrawn Successfully");
	}
	
	public int getCurrentBalance(){
		
		//manam a value return chestamo aa datatype return  type lo evali present currentBalance is int.
		return currentBalance;
	}
	
	
	public static void main(String[] args) {
		bBank bank = new bBank();
		greetCustomer();
		System.out.println("Current Balance is : " +bank.getCurrentBalance());
		bank.deposit(500);
		System.out.println("Current Balance is : " +bank.getCurrentBalance());
		withdrawl(300);
		System.out.println("Current Balance is : " +bank.getCurrentBalance());
		withdrawl(200);
		System.out.println("Current Balance is : " +bank.getCurrentBalance());
	}
	
	public static void greetCustomer(){
		
		System.out.println("Hello, Welcome to bank application");
		
	}

}
