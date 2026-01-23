package exception_handling;



public class Bank {

	public static double balance = 10000;
	
	
	public static void debit(double amount) throws InvalidAmountException {
		
		if(amount > balance) {
			throw new InvalidAmountException("Amount is greater thean balance");
		}
		else {
			balance = balance - amount;
			System.out.println("Amount Debited");
		}
	}
	
	public static void main(String args[]) {
		
		System.out.println("Program Started");
		try {
			debit(3000);
		}
		catch(InvalidAmountException a) {
			System.out.println(a.getMessage());
		}
		
		System.out.println("Program Ended");
	}
}