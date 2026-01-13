package methods;

public class Program6 {

	public static void main(String[] args) {
		num(1,2);
		num('A','B');
		//Compiler-->Actual Argument
		/*
		 * known as compile time polymorphism
		 * compile time binding/static binding
		 * 
		 * 
		 * process of binding between method call stmt
		 *  and implementation of the method during 
		 *  compilation by the compiler based on actual argument
		 */
		num(10.3,'A');//example of static binding or complie time polymorphy
		

	}
	public static void num(int a,int b) {
		//implementation (not method body)
		System.out.println("int,int");
	}
	public static void num(double a, double b) {
		System.out.println("double , double");
	}
	public static void num(char a, char b) {
		System.out.println("char,char");
	}
	public static void num(int a, char b) {
		System.out.println("int, char");
	}
	

}
