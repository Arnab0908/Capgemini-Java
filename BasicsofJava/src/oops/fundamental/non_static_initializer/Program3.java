package oops.fundamental.non_static_initializer;

public class Program3 {
	static Program3 obj1;
	//address ,null

	public static void main(String[] args) {
		
		Program2 obj1=new Program2();
		System.out.println(obj1.a);
		System.out.println(obj1.d);
		System.out.println(obj1.b);
		System.out.println(obj1.s);

	}

}
