package encapsulation;

public class Test4 {

	public static void main(String[] args) {
		Demo obj= Demo.getA();
		obj.setValueA(100);
		System.out.println(obj.getValueA());
		Student student=new Student();
		student.setId(231);
		student.setName("Joe Doe");
		System.out.println(student.getId());
		System.out.println(student.getName());
		
		
		
		

	}

}
