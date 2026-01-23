package polymorphism_runtime;

public class Test {
public static void main(String[]args) {
	Lion lion=new Lion();
	lion.sound();
	
	Dog dog=new Dog();
	dog.sound();
	//upcasting
	
	System.out.println("upcasting-->overriding begins");
	Animal animal=new Lion();
	animal.sound();
	Animal animal1=new Dog();
	animal1.sound();
}
}
