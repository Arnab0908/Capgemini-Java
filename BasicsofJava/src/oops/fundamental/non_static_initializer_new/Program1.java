package oops.fundamental.non_static_initializer_new;

public class Program1 {

	static {
		System.out.println("Static Block 1");
	}
	//Non static Initializer thus executed after static as
	//class loading done before method loading
	//class loading done before object loading
	{
		System.out.println("Static Block 3");
	}
	public static void main(String[] args) {
		System.out.println("main");
		new Program1();
	}
	static {
		System.out.println("Static Block 2");
	}

}
