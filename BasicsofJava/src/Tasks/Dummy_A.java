package Tasks;
public class Dummy_A {

	static String a1="a1 variable";
	public static void a1() {
		System.out.println("static a1()");
	}
	static {
		System.out.println("dummyA static init");
	}
	String a2= "a2 variable";
	public void a2() {
		System.out.println("NS a2()");
		
	}
	{
		System.out.println("dummy A1 NS init");
	}
	public Dummy_A() {
		super();
		System.out.println("Dummy A1 constructor");
	}
	public static void main(String[] args) {
		System.out.println("Dummy A1 main");
	}
}