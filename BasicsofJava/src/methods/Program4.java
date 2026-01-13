package methods;

public class Program4 {

	public static void main(String[] args) {
		//if method returns void type it doesn't return anything
		
		System.out.println(test());
	}
	//break cannot be used inside loop and switch
	public static int test() {
		if(true) {
		System.out.println("Test");
		return 10;}//as return contains int type so function should be also int
		System.out.println("Hi");
		return 100 ;
	}
	//return data-->> value return by method
	//return type-->datatype of the value return by method
}
