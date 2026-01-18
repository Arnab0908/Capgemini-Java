package encapsulation;


public class Demo1 {

	
	//private variable global var,method,Constructor
	//class Initializer not used 
	// Constructor ---> object 
	private Demo1(){
		
	}
	private int a;
	// write value , read the value
	
	//method write design setter method
	//read the value design getter method
	
	public int getValueA() {
		return a;
	}
	
	public void setValueA(int a) {
		this.a=a;
	}
	// Factory Method
	static Demo1 object;//null/ref
	public static Demo1 getA() {
		if(object==null) {
			object=new Demo1();
			
		}
		return new Demo1();
	}
}