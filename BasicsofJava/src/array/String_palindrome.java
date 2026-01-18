package array;


public class String_palindrome {
	/*
	 * write a program to check Given String is Palindrome or not.
Explanation:-
  Reverse the String, After the Reverse Given String check the reversed string and user Given String Both are the same or not.
      based on the result return a  suitable message 
    
Example:-
        Input:-
                        String str = "racecar";
                    After Reverse:-    racecar   
                    compares the user-given String and the  Reversed String both are the same or not.
                   both are the same print Pallindrome otherwise print not a Pallindroome.
         output:-
                     The Given String is Palindrome


	 */
	public static void main(String[] args) {
		String str ="radar";
		String rev="";
		//reverse string
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}if(str.equals(rev)) {
			System.out.println("string is palindrome");
			
		}else {
			System.out.println("string is not palindrome");
		}
	}

}
