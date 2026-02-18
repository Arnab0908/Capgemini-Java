package lambda_expression;

public class Main2 {

	public static void main(String[] args) {
		//if the method is not an argument method and not a return type method in the functional interface
		Demo2 demo=(a)->{
			System.out.println("Method implemented by using Lambda Expression");
		};
		demo.print(5000);
	}
	
}
