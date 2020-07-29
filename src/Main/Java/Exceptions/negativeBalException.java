package Exceptions;

public class negativeBalException extends Exception {
    public negativeBalException() {
        super("balance is negative");
    }
}
