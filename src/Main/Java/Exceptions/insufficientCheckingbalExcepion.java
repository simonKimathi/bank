package Exceptions;

public class insufficientCheckingbalExcepion extends Exception {
    public insufficientCheckingbalExcepion() {
        System.out.println("account balance is below 500");
    }
}
