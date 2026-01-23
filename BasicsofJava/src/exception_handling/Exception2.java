package exception_handling;

public class Exception2 {
public static void vote(int age) throws ClassNotFoundException {
	if(age>=18) {
		System.out.println("Candidate voted");
		
	}else {
		//try {
		
		//throw new ArithmeticException();
	throw new ClassNotFoundException();	
	}
		//catch(ArithmeticException e) {
			//System.out.println("Cannot vote");
		//}
	}

public static void main(String[] args) {
	System.out.println("Candidate went for voting");
	try {
	vote(17);}
	catch(Throwable t) {
	System.out.println("cadidate cannot vote");
}
	System.out.println("candidate came hpme");

}
}

			
	
	
