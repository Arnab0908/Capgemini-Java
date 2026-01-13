package methods;

public class Program3 {

	public static void main(String[] args) {
		System.out.println("Main Start");
		test();
		System.out.println("Main End");
//when test function is called the calling function that is main calls 		
//test and after that is executed
//then the leftover main function is executed
	}

	public static void test() {
		System.out.println("Test start");
		System.out.println("Test end");
//		void
		//primitive data
		//Non primitive datatype-->String
//		non primitive>>array ,string,object,interfaces
	}
	}


