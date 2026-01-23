package abstraction;

abstract class Payment {

    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // concrete method
    public void paymentInfo() {
        System.out.println("Payment Amount: ₹" + amount);
    }

    // abstract method
    public abstract void makePayment();
}
