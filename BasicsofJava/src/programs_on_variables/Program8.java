package programs_on_variables;

public class Program8 {
	public static void main(String[]args) {
		
		short s=65;//2 byte
		char c=65;//2 byte(65 is ascii value)
		byte b=(byte)128;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(s);// value is given in a cyclic manner
		/*
		 * -128 -->0<-127
		 * 128-->-127
		 * 129--.-127
		 */
		int j=1_00_0;
		System.out.println(j);
		int k=1_4;
		System.out.println(k);
				
	}

}
