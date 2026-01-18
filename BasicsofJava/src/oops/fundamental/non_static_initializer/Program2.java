package oops.fundamental.non_static_initializer;

public class Program2 {
	int a;
	double d;
	byte b;
	String s;

	public static void main(String[] args) {
		Program2 obj1=new Program2();//assigning object in variable
		//it cannot transfer one to other datatype , typecasting not possible
		System.out.println(obj1);//reference
		obj1=null;
		System.out.println(obj1);//value
		
	}
		{int i=20;//primitive
		i=30;
		i='A';
	/*
	 * syntax: new constructor().global variable
	 * all the non primitive datatyoes have null or 0 value
	 */
		
		

}
}