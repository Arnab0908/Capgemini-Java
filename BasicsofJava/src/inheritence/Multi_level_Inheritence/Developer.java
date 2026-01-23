package inheritence.Multi_level_Inheritence;

public class Developer extends Employee {
	String technology;
	public Developer(int id,String name,double sal,String technology) {
		super(id,name,sal);
		this.technology=technology;
		
	}public void DisplayDev() {
		DisplayEmp();
		System.out.println(this.technology);
		
	}
	public static void main(String[] args) {
		Developer d=new Developer(100,"Jatin",5000,"Springboot");
		d.DisplayDev();
		
	}

}


