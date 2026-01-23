package exception_handling;

public class InvalidAmountException extends Exception {

    public InvalidAmountException(String msg) {
        super(msg);   // passes message to Exception class
    }
}
