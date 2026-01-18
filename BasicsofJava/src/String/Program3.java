package String;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2=new String("Hello");
		System.out.println(s1==s2);//false and reference will be taken into account
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.matches(s2));//value matches

	}

}
