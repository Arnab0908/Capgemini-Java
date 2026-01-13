package flowControlStatement.DecisionStmt;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(true) {//if true only first loop gets executed
			System.out.println("1");
			System.out.println("2");
		}else if(true){
			System.out.println("3"); 
			System.out.println("4");
		}else {
			System.out.println("5");
			System.out.println("6");
		}

	}

}
