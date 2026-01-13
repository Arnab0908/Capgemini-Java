package methods;

public class Program8_strongno {

	public static void main(String[] args) {
		// TODO Strong number
		//145=1!+4!+5!
		int a=145;
		System.out.println(Strong(a));
	}//factorial part
	public static int fact(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static String Strong(int a) {
		
		int lastdigit=0;
		int temp=a;
		int sum=0;
		while(a>0) {
			lastdigit=a%10;
			sum+=fact(lastdigit);
			a/=10;
		}
		return sum==temp?"Strong":"not strong";
			
	}
		

	}

