package flowControlStatement.WhileLoopStmt;

public class Program4_spyno {

	public static void main(String[] args) {
		int num=123;
		int sum=0;//3
		int product=1;//it becomes 3
		while(num!=0) {//123!=0
		sum=sum+num%10;//0+3
		product=product*num%10;
		num=num/10;//123/10-->12
		}
		if(sum==product) {
			System.out.println("Spy no.");
		}else {

		System.out.println("Not a spy no.");
		

		}
	}
}


