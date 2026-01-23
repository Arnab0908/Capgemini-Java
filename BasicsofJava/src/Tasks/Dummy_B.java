package Tasks;

public class Dummy_B extends Dummy_A {

	static String b1="b1 var";
	public static void b1() {
		
		System.out.println("static b1()");
	}
	static {
		System.out.println("Dummy static init");
	}
	String b2="b2 variable";
	public void b2() {
		System.out.println("NS b2()");
	}
	{
		System.out.println("Dummy A2 NS init");
	}
	public Dummy_B() {
		super();
		System.out.println("Dummy A2 constructor");
	}
	public static void main(String[] args) {
		Dummy_B obj=new Dummy_B();
		System.out.println(a1);
		a1();
		obj.a2();
	}
}