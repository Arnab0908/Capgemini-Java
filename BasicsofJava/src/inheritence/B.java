package inheritence;

public class B  extends A{
	static int j=20;
	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(B.a);//IS -A1 relationship
		B.print();
		System.out.println(B.j);
		System.out.println(A.a);
	}
/*
 * i--->A1-->A2-->Genralized member
 * j-->A2--->specialized member
 */
}
