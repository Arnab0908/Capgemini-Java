package Operators.logicaloperators;

public class Program2 {

	public static void main(String[] args) {
		System.out.println(false|| true||false);
		int a=6;
		System.out.println(a>10|| ++a>10);
		System.out.println(a);
		System.out.println(a<10 || ++a>10 );
		/*
		 * Logical or operator will check only for true condition
		 *  and once it finds true it terminates there only
		 */
		int b=6;
		System.out.println(!(b<10) && ++b>10);
		System.out.println(b);
		

	}

}
