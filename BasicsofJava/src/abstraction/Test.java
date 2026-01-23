package abstraction;

public class Test {
	 public static void main(String[] args) {

	        Payment p1 = new CreditCard(8000, "VISA", "1234567812345678");
	        p1.paymentInfo();
	        p1.makePayment();

	        System.out.println("-----------------------");

	        Payment p2 = new UPIPayment(1500, "arnab@upi");
	        p2.paymentInfo();
	        p2.makePayment();
	    }

}
