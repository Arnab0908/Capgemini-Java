package inheritence.method_shadowing_multilevel;

public class M3 extends M2{
	public void method() {
		System.out.println("message m3");
	}
public void display() {
	method();//accessing from M3
	super.method();//accessing from M2
}
public static void main(String[] args) {
	M3 m3=new M3();
	m3.display();
	M1 m1=new M1();//accessing from m1
	m1.method();
}
}
