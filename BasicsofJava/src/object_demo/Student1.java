package object_demo;

public class Student1 {
	
	String studentName;
	int studentPhoneNo;
	String studentEmail;
	
	public Student1(String studentName, int studentPhoneNo, String studentEmail) {
		this.studentName = studentName;
		this.studentPhoneNo = studentPhoneNo;
		this.studentEmail = studentEmail;
	}
	
	public boolean equals(Object ob) {
		
		if(ob instanceof Student1) {
			Student1 s = (Student1)ob;
			if(this.studentEmail.equals(s.studentEmail) || this.studentPhoneNo == s.studentPhoneNo) {
				return true;
			} else {
				return false;
			}
		}
			
		
		if(ob instanceof Employee1) {
			Employee1 e = (Employee1)ob;
			if(this.studentEmail.equals(e.empEmail) || this.studentPhoneNo == e.empPhoneNo) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Student1 s1 = new Student1("Arunima", 101, "aru@gmail.com");
		Student1 s2 = new Student1("Arunima", 101, "aru@gmail.com");
		Employee1 e1 = new Employee1("Arunima", 101, "aru@gmail.com");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(e1));
	}}