package Tasks;

public class Task7 {

	public static void main(String[] args) {
		int [] arr= {5,7,25,14,10,20,4,15};
		int max=arr[0];
		int min=arr[0];
		
		for(int i =1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
						
			}
		int diff=max-min;
		System.out.println("maximum :"+max);
		System.out.println("minimum :"+min);
		System.out.println("difference :"+diff);
		
	}

}
