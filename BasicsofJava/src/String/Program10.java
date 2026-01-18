package String;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java!w#qse(";
		String s1[]=s.split("[!#(]");
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}

	}

}
