package exception_handling;
public class CustomException {

	public static void calcResult(double percentage) {
		
		if(percentage > 0 || percentage <=100 ) {
			if(percentage > 45) {
				System.out.println("passed");
			}
		}
		else {
			throw new InvalidPercentageException("Percentage is invalid");
		}
	}
	
	public static void main(String args[]) {
		
		try {
			calcResult(120);
		}
		catch(InvalidPercentageException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program Ended");
	}
}

