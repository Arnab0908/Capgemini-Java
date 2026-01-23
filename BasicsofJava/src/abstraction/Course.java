package abstraction;

abstract class Course {
	String name;
	Course(String name){
		this.name=name;
		
	}
//Concrete method
	void courseInfo() {
		System.out.println("Course Name"+ name);
	}
	abstract double countPrice() ;
		
	}

