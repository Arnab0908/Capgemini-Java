package inheritence.shadowing_multivariable;

public class B3 extends B2{
	int b=30;
	public void display() {
		System.out.println(b);//accessing own class
		System.out.println(super.b);//accessing B2 class
		System.out.println(((B1)this).b);//accessing B1 class using typecaster
	}
public static void main(String[] args){
	B3 b3=new B3();
	b3.display();
	
}
}
