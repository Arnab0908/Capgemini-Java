package constructor;

public class Program1 {


		Program1(int a){
			System.out.println("BankAccount()");
			
		}
		public static void main(String[]args) {
			new Program1(10);

	}
		{
			System.out.println("Non static block");
		}
}


