package Tasks;
import java.util.*;

public class Middle_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 digits");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b && a<c)||(a>c && a<b)){
			System.out.println(a+"is the middle");
		}
		else if ((b>a && b<c)||(b<a && b>c)){
			System.out.println(b+"is the middle");
			
		}else {
			System.out.println(c+"is the middle");
		}
			
	}

}
