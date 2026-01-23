package abstraction;

class CreditCard extends Payment {

    private String cardCompany;
    private String cardNumber;

    public CreditCard(double amount, String cardCompany, String cardNumber) {
        super(amount);
        this.cardCompany = cardCompany;
        this.cardNumber = cardNumber;
    }

    @Override
    public void paymentInfo() {
        System.out.println("Payment Method : Credit Card");
        System.out.println("Card Company   : " + cardCompany);
        System.out.println("Amount         : ₹" + amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Credit Card Payment Successful");
        System.out.println("Card Number    : **** **** **** " +
                cardNumber.substring(cardNumber.length() - 4));
    }
}

