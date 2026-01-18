package oops.fundamental.non_static_methods;

public class Student {
	String id;
	String name;
	int marks;
	public Student(String id, String name,   int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
		public void display() {
			System.out.println(this.id);
			System.out.println(this.name);
			System.out.println(this.marks);
			System.out.println();
		}
	

}
