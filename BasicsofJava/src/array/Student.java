package array;

public class Student {
	String name;
	int age;
	int marks;
	String gender ;
	double percentage;
	
	Student(String name, int age, int marks, String gender,double percentage){
		this.name=name;
		this.age=age;
		this.marks=marks;
		this.gender=gender;
		this.percentage=percentage;
	}
	void display(){
	System.out.println(name+"||"+age+ "||"+marks+"||"+gender+ "||"+ percentage + "||");

	}
	}


