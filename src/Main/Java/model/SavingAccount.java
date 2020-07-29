package model;


import Exceptions.accountLengthException;
import Exceptions.insufficientBalanceException;
import Exceptions.negativeBalException;

public class SavingAccount extends BankAccount {
   // private double balance;
    //inherits balance from parent class
    public SavingAccount() {
        super();
    }
    public SavingAccount(String accountNumber, String name, double balance) throws negativeBalException, accountLengthException {
        super(accountNumber, name, balance);
    }
    @Override
    public void calculateInterest() throws negativeBalException {
     double interest=(0.05*getBalance()*1);
     setBalance(getBalance()+interest);
     System.out.println("added interest and updated balance");
    }
    @Override
    public void withdraw(double amount) throws insufficientBalanceException {
    if (getBalance()< 2500) {
        this.withdraw(amount);
    }else {
        throw new insufficientBalanceException();
    }
}}
