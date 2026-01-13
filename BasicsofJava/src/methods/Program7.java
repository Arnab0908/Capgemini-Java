package methods;

public class Program7 {
	//SUNNY NUMBER

	// TODO Auto-generated method stub
			int a=8;
			Sunny(a);
			
		}
		public static boolean perfectsquare(int a) {
			
		int square=(int)Math.sqrt(a);
		return square*square==a;
		}
		public static boolean Sunny(int a) {
			if(a==perfectsquare(a)-1) {
				return true;
			}else {
				return false;
	
