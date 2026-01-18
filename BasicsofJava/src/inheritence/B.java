package inheritence;

public class B  extends A{
	static int j=20;
	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(B.a);//IS -A relationship
		B.print();
		System.out.println(B.j);
		System.out.println(A.a);
	}
/*
 * i--->A-->B-->Genralized member
 * j-->B--->specialized member
 */
}
