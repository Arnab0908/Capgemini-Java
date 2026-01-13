package flowControlStatement.patternStmt;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
for(int row=1;row<=n;row++) {
	for (int col=1;col<=2*n-1;col++) {
		if(row<=col && row+col<=2*n) {
		System.out.print("*");
		}else {
		System.out.print(" ");
	}
	
	}System.out.println();

}
	}
}


