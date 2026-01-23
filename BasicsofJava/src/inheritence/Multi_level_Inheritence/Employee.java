package inheritence.Multi_level_Inheritence;

public class Employee extends Person {
//	int id;
//	String name;
	double sal;

public Employee(int id ,String name, double sal) {
	super(name,id);
	
	this.sal=sal;
	
}
public void DisplayEmp() {
	DisplayPerson();
	System.out.println(this.sal);
	
}

}
