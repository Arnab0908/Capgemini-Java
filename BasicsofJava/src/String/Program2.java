package String;

public class Program2 {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="hello ";
		String s3="hello";
		String s4=" hello";
		String s5=" hello ";//4objects are created
		//spaces are taken into account
       System.out.println(s1.hashCode());
       System.out.println(s2.hashCode());
      System.out.println(s3.hashCode());
      System.out.println(s4.hashCode());
      System.out.println(s5.hashCode());
       
	}
		// TODO Auto-generated method stub

	}


