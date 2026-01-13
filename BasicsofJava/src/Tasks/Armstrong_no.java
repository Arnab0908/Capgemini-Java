package Tasks;

public class Armstrong_no {

	public static void main(String[] args) {
		int num = 153;
		int temp=num;
		int digits=0;
		int sum=0;
		// calculating the no. of digits
		while(temp!=0) {
			digits++;
			temp/=10;
			
		}
		temp=num;
			//calculating armstrong no:
		while(temp!=0) {int digits1= temp%10;
		int power =1 ;
		
		  for (int i = 1; i <= digits; i++) {
              power *= digits1;
          }

          sum += power;
         
		}
		 if (sum == num) {
	            System.out.println(num + " is an Armstrong number");
	        } else {
	            System.out.println(num + " is not an Armstrong number");
	        }

}
}
