package Tasks;

public class Task3automorphicno {



	public static void main(String[] args) {
		int num= 625;
		int sq= num*num;
		int lastdigit=0;
		int temp=num;
		int place=1;
		while(temp!=0) {
			lastdigit+=(sq%10)*place;
			sq/=10;
			place*=10;
			temp/=10;
		}
		if(num==lastdigit) {
			System.out.println("No. is automorphic");
			} else {
				System.out.println("No. is not automorphic");

	}

}
}

