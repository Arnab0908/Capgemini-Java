package inheritence.Multi_level_Inheritence;

public class Person {
	String name;
	int age;
	public Person(String name,int age) {
		super();
		this.name=name;
		this.age=age;
		
	}
	public void DisplayPerson() {
		System.out.println(this.name);
		System.out.println(this.age);
	}

}
