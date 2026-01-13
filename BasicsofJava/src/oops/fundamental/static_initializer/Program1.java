package oops.fundamental.static_initializer;

public class Program1 {
	static int i=test();//single line  static initializer
	//Application---> opening
	//i is the initializer

	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println(i);
		System.out.println("Main end");
		

	}
	public static int test() {
		System.out.println("Test");
		System.out.println(i);
		return 10;
	}

}
