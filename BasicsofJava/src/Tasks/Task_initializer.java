package Tasks;//MCQ QUESTIONS

public class Task_initializer {

	static {
		System.out.println("static block 1");
	}
	
	{
		System.out.println("non-static block 1");
	}
	int a=demo();//non-static initializer
	public static void main(String[] args) {
		
		new Task_initializer();
		new Task_initializer(10);
		
	}
	
	{
		System.out.println("non-static block 2");
	}
/*
 * constructor-->NSI--.user defined statements
 */
	
	static {
		System.out.println("static block 2");
	}
	
	Task_initializer(){
		System.out.println("BankAccount()");
	}
	
	Task_initializer(int a){
		System.out.println("BankAccount(int a)");
	}
	
	public int demo() {
		System.out.println("demo()");
		return 10;
	}
}

