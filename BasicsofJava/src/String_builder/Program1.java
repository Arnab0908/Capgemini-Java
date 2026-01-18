package String_builder;

public class Program1 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.length());
		sb.append("12345678901234566");//initial capacity 16
		//added capacity=old capacity*2+2
		System.out.println(sb.length());
		sb.append("123456");
		System.out.println(sb.capacity());
		

	}

}
