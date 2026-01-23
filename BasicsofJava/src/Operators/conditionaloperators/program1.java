package Operators.conditionaloperators;

public class program1 {

	public static void main(String[] args) {
		System.out.println(true?10:20);//if true then it takes 2nd operand 
		System.out.println(false?"A1":65);//if flase then it takes 3rd operand
		System.out.println(10>'A'?true:false);
		System.out.println("Hello"!="hello"?'A':'B');//it is true so returns 2nd operand
		System.out.println(40>30?'A':'B');
		String res =40>30?"A1":"true";		
		System.out.println(res);// operand 2 and operand 3 should and must be of same data type

	}

}
