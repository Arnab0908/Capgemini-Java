package polymorphism_runtime;

public class Permanent_Employee extends Employee {
	double basicSalary;



	public Permanent_Employee(int id, String name, double basicSalary) {
		super(id, name);
		this.basicSalary=basicSalary;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("basic salary"+basicSalary);
		
	}
	public double calculateSalary() {
		return basicSalary +(basicSalary *0.20)+(basicSalary *10);
		
	}
}
	
