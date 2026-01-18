package Tasks;

public class Array_tasks_1 {

	public static void main(String[] args) {
		int[] arr= {0,1,0,0,0,1,1,1,0,0};
		int countones=0;
		
		for (int x:arr) {
			if(x==1)
				countones++;			
		}
		for(int i=0;i<arr.length;i++) {
			if(i<countones) 
				arr[i]=1;
			else arr[i]=0;
				
			}
			for(int x: arr) {
				System.out.print(x);
			}
				
		}
}

