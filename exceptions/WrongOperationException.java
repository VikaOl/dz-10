package exceptions;

public class WrongOperationException extends Exception {
    private int balance;

    public WrongOperationException(String message, int balance) {
        super(message);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}