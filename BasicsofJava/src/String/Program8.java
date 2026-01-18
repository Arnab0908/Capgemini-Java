package String;

public class Program8 {

	public static void main(String[] args) {
	System.out.println("83456".matches("[6-9]\\d+"));
	System.out.println("5624978513".matches("[6-9]\\d{9}"));
	System.out.println("8624978513".matches("[6-9]\\d{9}"));
	System.out.println("5624978513".matches("[6-9]\\d{9,12}"));
	}

}
