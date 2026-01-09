package Tasks;

public class Task1 {

	public static void main(String[] args) {
		// conversion of byte to other 6 datatypes
		byte b1= 70;
		char b2= (char)b1;
		System.out.println("byte conversion--   "+b2);
		long  b3= (long)b1;
		System.out.println(b3);
		double b4=(double)b1;
		System.out.println(b4);
		int b5=(int)b1;
		System.out.println(b5);
		short b6=(short)b1;
		float b7=(float)b1;
		System.out.println(b6);
		System.out.println(b7);
		
		
		short s1= 81;
		byte s2=(byte)s1;//Typecasting
		System.out.println("short conversion   "+s2);
		long s3= s1;
		System.out.println(s3);
		char s4=(char)s1;//Although it has same byte but char can never contain negative value 
		System.out.println(s4);
		double s5=(s1);
		float s6=(s1);
		int s7=(s1);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		
		double d1=81.5;//double to other 6 data types
		short d2=(short)d1;
		int d3=(int)d1;
		byte d4=(byte)d1;
		long d5=(long)d1;
		char d6=(char)d1;
		float d7=(float)d1;
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		System.out.println(d7);
		
		
		
		
		

	}

}
