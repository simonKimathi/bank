package model;
import Exceptions.accountLengthException;
import Exceptions.insufficientBalanceException;
import Exceptions.negativeBalException;

public class CheckingAccount extends SavingAccount{

    public CheckingAccount() {
        super();
    }

    public CheckingAccount(String accountNumber, String name, double balance) throws negativeBalException, accountLengthException {
        super(accountNumber, name, balance);
    }
    //override base method
    @Override
    public void calculateInterest() throws negativeBalException {
        double interest=(0.0075*getBalance()*1);
        setBalance(getBalance()+interest);
        System.out.println("added interest and updated balance");
    }

    @Override
    public void withdraw(double amount) throws insufficientBalanceException {
        if(getBalance()<500){
            throw new insufficientBalanceException();
        }
        else{
            super.withdraw(amount);
        }
    }
}
