package m1_tasks;
/*
 * Given an array nums, return an array where each element is the product of all other elements.

Example:
Input: [1,2,3,4]
Output: [24,12,8,6]
(Submit the program)
 */

public class Array_1 {
	class Solution {
	    public int lengthOfLongestSubstring(String s) {
	        int[] freq = new int[256];
	        int left = 0, max = 0;

	        for (int right = 0; right < s.length(); right++) {
	            char c = s.charAt(right);
	            freq[c]++;

	            while (freq[c] > 1) {
	                freq[s.charAt(left)]--;
	                left++;
	            }
	            max = Math.max(max, right - left + 1);
	        }
	        return max;
	    }
	}

}
