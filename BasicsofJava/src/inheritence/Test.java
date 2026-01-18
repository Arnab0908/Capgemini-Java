package inheritence;

public class Test {
	public static void main(String[] args) {
		Nephrologist n=new Nephrologist();
		  n.setName("Dr. Sharma");
	        n.setAge(45);
	        n.setHospital("AIIMS");
	        n.setSpecialization("Brain Disorders");

	        System.out.println("Neurologist Details:");
	        System.out.println(n.getName());
	        System.out.println(n.getAge());
	        System.out.println(n.getHospital());
	        System.out.println(n.getSpecialization());

	        System.out.println("--------------------");

	        Cardiologist c = new Cardiologist();
	        c.setName("Dr. Mehta");
	        c.setAge(50);
	        c.setHospital("Apollo");
	        c.setExperience(20);

	        System.out.println("Cardiologist Details:");
	        System.out.println(c.getName());
	        System.out.println(c.getAge());
	        System.out.println(c.getHospital());
	        System.out.println(c.getExperience() + " years");
	    }
		
		
	}


