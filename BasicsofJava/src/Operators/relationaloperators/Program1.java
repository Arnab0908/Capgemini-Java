package Operators.relationaloperators;

public class Program1 {

	public static void main(String[] args) {
		//'A1'--> ASCII
		//"A1"-->hashCode-->hashFunction
		//strings cannot be compared as strings have hashcode values but not ascii values
		boolean res=10<20;
		System.out.println(res);
		res='A'=='B';
		System.out.println(res);
		res="A1"=="A2";//"==" checks the memory reference hence they can be compared to strings
		System.out.println(res);
		
		//>,<,>=,<=,==,!+ --.byte,short,int,long
		//String, boolean -->==,!=
		res="A1".equals("A1");//.equals() is method of string
	    System.out.println(res);
	    //no operator overloading works on java
		

	}

}
