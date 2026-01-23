package Tasks;


	/*
	 * A1 subarray is a continuous (connected) part of an array. The elements must be next to each other
and in the same order.
Example:
Array = [1, 2, 3, 4]
Valid Subarrays:
1 [1]
2 [2]
3 [3]
4 [4]
5 [1, 2]
6 [2, 3]
7 [3, 4]
8 [1, 2, 3]
9 [2, 3, 4]
10 [1, 2, 3, 4]
Invalid Subarrays:
1 [1, 3] (elements are skipped)
2 [2, 4] (not continuous)
3 [3, 1] (order changed)
	 */
	import java.util.Scanner;
	public class Task_13 {

	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input size
	        System.out.println("Enter array size: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        // Input elements
	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Printing subarrays
	        System.out.println("All subarrays are:");
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                for (int k = i; k <= j; k++) {
	                    System.out.print(arr[k] + " ");
	                }
	                System.out.println();
	            }
	        }

	        sc.close();
	    }
	}
