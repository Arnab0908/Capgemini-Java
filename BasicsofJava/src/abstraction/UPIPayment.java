package abstraction;

class UPIPayment extends Payment {

    private String upiId;

    public UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void paymentInfo() {
        System.out.println("Payment Method : UPI");
        System.out.println("UPI ID         : " + upiId);
        System.out.println("Amount         : ₹" + amount);
    }

    @Override
    public void makePayment() {
        System.out.println("UPI Payment Successful");
    }
}
