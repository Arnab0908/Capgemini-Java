package array;

public class Program6 {

	public static void main(String[] args) {
		
		Employee[] employee=new Employee[3];
		employee[0]= new Employee(1,"Adam",20000);
		employee[1]= new Employee(2,"Miller",40000);
		employee[2]= new Employee(3,"King",50000);
		for(int i=0;i<employee.length;i++) {
			employee[i].display();
		}
		
		
		

	}

}
