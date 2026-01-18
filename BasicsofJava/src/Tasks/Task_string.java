package Tasks;

 public class Task_string {

	
		
		    public static void main(String[] args) {
		        String input = "java is an oop lang";
		        String result = reverseEachWord(input);
		        System.out.println(result);
		    }

		    public static String reverseEachWord(String str) {
		        String[] words = str.split(" ");
		        StringBuilder result = new StringBuilder();

		        for (String word : words) {
		            StringBuilder revWord = new StringBuilder(word);
		            result.append(revWord.reverse()).append(" ");
		        }

		        return result.toString().trim();
		    }
		}

 


