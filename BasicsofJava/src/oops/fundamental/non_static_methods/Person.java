package oops.fundamental.non_static_methods;

public class Person {

	//Constructor
	//Non Static method -->

	
		String name;//null
		int age;//0
		String gender;//null
		//Constructor creation
		//default constructor is created if no constructor declared
		Person(int a){
			
		System.out.println("Person int a");}
		public void display() {
			System.out.println(this.name+"");
			System.out.println(this.age+"");
			System.out.println(this.gender+"");
			
		}
	public void initialize(String name, int age, String gender)
	{		
	this.name=name;
	this.age=age;
	this.gender=gender;
		//this has the current object reference
		//non-static members with same name
		
	}
}


