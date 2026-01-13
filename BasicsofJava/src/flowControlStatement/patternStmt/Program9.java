package flowControlStatement.patternStmt;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *     *   *
		 *     ** **
		 *     *****
		 *     ** **
		 *     *   *  
		 */

		int n=3;
			for(int row=1;row<=n;row++) {
				
				for (int col = 1; col <= 2*n - 1; col++) {
				    if (col >= n - (row - 1) && col <= n + (row - 1)) {
				        System.out.print("*");
				    } else {
				        System.out.print(" ");
				    }
				}
				System.out.println();

		}
	}

}
