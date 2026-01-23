package inheritence.Single_level_Inheritence;

public class Employee {
	int id;
	String name;
	double sal;

public Employee(int id ,String name, double sal) {
	super();
	this.id=id;
	this.name=name;
	this.sal=sal;
	
}
public void DisplayEmp() {
	System.out.println(this.id);
	System.out.println(this.name);
	System.out.println(this.sal);
	
}

}
