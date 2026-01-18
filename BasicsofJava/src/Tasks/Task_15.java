package Tasks;

public class Task_15 {
/*
 * Find the Sum of All Possible Subarrays
Given an integer array of size n, find the sum of elements of all possible contiguous subarrays of the array.
Sample Input: [1, 2, 3]
Sample Output: 20

 */
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3};
	        int n = arr.length;

	        int totalSum = 0;

	        // two pointer approach
	        for (int start = 0; start < n; start++) {
	            int currentSum = 0;
	            for (int end = start; end < n; end++) {
	                currentSum += arr[end];   // expand end pointer
	                totalSum += currentSum;
	            }
	        }

	        System.out.println("Sum of all subarrays: " + totalSum);

	}

}
