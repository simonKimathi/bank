package model;

import java.util.Date;
import Exceptions.accountLengthException;
import Exceptions.insufficientBalanceException;
import Exceptions.negativeBalException;

public class BankAccount {
    public String accNo, name;
    public double balance;
    public Date date;

    public BankAccount() {
        this.setDate(new Date());
    }

    public BankAccount(String accNo, String name, double balance) throws negativeBalException, accountLengthException {
        this.setAccNo(accNo);
        this.setName(name);
        this.setBalance(balance);
        this.setDate(new Date());
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accountNumber) throws accountLengthException {

        this.accNo = accountNumber;
        if(this.accNo.length()==6) {
        }else{
            throw new accountLengthException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) throws negativeBalException {
        if(balance<0){
            throw  new negativeBalException();
        }
        this.balance = balance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void displayAccountInfo(){
        System.out.println(this.toString());
    }
    public void deposit(double amount) throws negativeBalException {
        this.setBalance(this.getBalance()+amount);
        System.out.println(this.balance);;
    }
    public void withdraw(double amount) throws insufficientBalanceException, negativeBalException {
       if(balance>amount) {
           this.setBalance(this.getBalance()-amount);
       }
       else {
        throw new insufficientBalanceException();
       }
        System.out.println(getBalance());
    }
    public void calculateInterest() throws negativeBalException {
        System.out.println("This method will calculates interest");
    }
    @Override
    public String toString() {
        return "name:" + getName()+ " account no:" + getAccNo()+ " balance:" +  getBalance()+" date:" +   getDate();

    }
}
