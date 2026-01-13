package flowControlStatement.WhileLoopStmt;

public class Program3_neon_no {

	public static void main(String[] args) {
		
		int num=9;
		int sum=0;
		int sq=num*num;
		while(sq!=0) {
			sum+=(sq%10);
			sq/=10;
			
		}
		if(sum==num)
			System.out.println("Neon");
			else {
				System.out.println("Not neon");
			}

	}

}
