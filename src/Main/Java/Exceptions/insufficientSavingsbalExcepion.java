package Exceptions;

public class insufficientSavingsbalExcepion extends Exception {
    public insufficientSavingsbalExcepion() {
        System.out.println("account balance is below 2500");
    }
}
