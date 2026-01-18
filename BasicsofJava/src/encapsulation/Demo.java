package encapsulation;
//class Initializer not used
//Constructor-->object
public class Demo{

	private  Demo() {
		
		
	}	
	private int a;//write value ,read value
	//method write design setter method
	//read the value design getter method
	public int getValueA() {
		return a;
	}
	public void setValueA(int a) {
		this.a=a;
	}
	public static Demo getA() {
		return new Demo();//Factory method
	}
}
