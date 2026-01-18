
	package constructor;

	public class Test2 {
		static int count=0;
		
		{
			count++;
		}
		//factory method
		public static Test2 m1() {
			System.out.println("m1()");
			return new Test2();
		}

		public static void main(String[] args) {
			
			
		     m1().m2().m3();
			
		}
		
	     public Test2 m2() {
			System.out.println("m2()");
			return new Test2();
		 }
	     
	     public Test2 m3() {
	 		System.out.println("m3()");
	 		return this;
	 		
	 	 }
	}


