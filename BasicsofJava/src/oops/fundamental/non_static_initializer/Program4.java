package oops.fundamental.non_static_initializer;

public class Program4 {
	int i=3;
	static String s ="Hello";
	/*
	 * static initializers have single copy 
	 * non static initializers have multiple copies
	 */

	public static void main(String[] args) {
		Program4 obj1 =new Program4();
		Program4 obj2 =new Program4();
		System.out.println(obj1==obj2);//reference check false
		System.out.println(obj1.i);
		System.out.println(Program4.s);//static member calling using constructor
		System.out.println(obj1.s);

	}
}

