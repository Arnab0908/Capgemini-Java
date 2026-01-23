package object_demo;

public class Student {
	int id;
	String name;
	double per;
	public Student(int id ,String name,double per) {
		this.id=id;
		this.name=name;
		this.per=per;
	}
	public boolean equals(Object o) {//overriding .equals
		Student s=(Student)o;
		if(this.id==s.id) {
			return true;
			
		}return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Arnab",80);
		Student s2=new Student(1,"Sourab",80);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}

}
