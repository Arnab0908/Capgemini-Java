package inheritence;

public class TestB extends TestA {
	public TestB() {
		super(10);
		System.out.println("Test A2");
	}
		public static void main(String[] args) {
			TestB ob=new TestB();
		}
	}


