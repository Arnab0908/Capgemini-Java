package polymorphism_overloading;
import java.util.Scanner;

public class User_input_area  {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice 1-sq,2-rect,3-circle,4-exit");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("enter sides of sq");
			int a=sc.nextInt();
			Area_calculator.area(a);
			break;
		case 2:
			System.out.println("enter sides of rect");
			int l=sc.nextInt();
			int b=sc.nextInt();
			Area_calculator.area(l,b);
			break;
		case 3:
			System.out.println("enter base and height of tri");
			int base=sc.nextInt();
			int h=sc.nextInt();
			Area_calculator.area(base,h);
			break;
		case 4:
			System.out.println("Thanx for using cal.");
			break;
			default:
				System.out.println("invalid output");
			
		}sc.close();
		System.out.println("Execution over");

	}

}
