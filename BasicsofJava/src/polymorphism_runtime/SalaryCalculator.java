package polymorphism_runtime;
import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many employees to add");
		int n =sc.nextInt();
		sc.nextLine();
		Employee[] employee =new Employee[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the employee id");
			int id= sc.nextInt();
				sc.nextInt();
			System.out.println("1.Enter the employee name");
			System.out.println("2.Payroll emp");
			System.out.println("choose option");
			int choice=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			switch(choice) {
			case 1:{
				System.out.println("enter the basic salary");
			double salary =sc.nextDouble();
			Permanent_Employee pe= new Permanent_Employee(id,name,salary);
			employee[i]=pe;
			break;
			
			
			
		}case 2:{
			System.out.println("Enter the hours");
			int hours=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the rate");
			double rate=sc.nextDouble();
			sc.nextLine();
			PayRollEmployee payemp= new PayRollEmployee(id,name,hours,rate);
			employee[i]=payemp;
			break;
		}

	}
			for(Employee emp : employee) {
				emp.displayDetails();
				System.out.println(emp.calculateSalary());
			}
		}
	}
}

