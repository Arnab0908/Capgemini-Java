package methods;

public class Program7 {
	public static void main(String[] args) {
		int num =840;
		int next= num+1;
		boolean sunny = false;
		for(int i =1;i*i <=num+1;i++) {
			if(i*i== next) {
				sunny=true;
				break;
			}
			
		}
		if(sunny) {
			System.out.println(num+"is a sunny no.");
		}else {
			System.out.println(num+"is not a sunny no.");
		}
	}
}
	//SUNNY NUMBER

	
	
