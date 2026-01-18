package Tasks;

import java.util.Arrays;

public class Task_string_1 {

	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		if(s1.length()!=s2.length()) {
			System.out.println("not an anagram");
			}else {
		char[]ch1=s1.toCharArray();
		char[]ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		int c=0;
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]==ch2[i]) {
				c++;
			}
			if(c==ch1.length) {
				System.out.println("Anagram");
			}else {
				System.out.println("not anagram ");
			}
			
		}
		
		
		
	}

	}
}
