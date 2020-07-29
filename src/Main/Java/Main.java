
import Exceptions.insufficientCheckingbalExcepion;
import Exceptions.insufficientSavingsbalExcepion;
import model.BankAccount;
import model.CheckingAccount;
import model.SavingAccount;

public class Main {

    public static void main(String[] args) throws Exception {
	BankAccount bankAccount=new BankAccount("121212","simon  kimathi",25000);
	bankAccount.displayAccountInfo();
	//check if account has more than 2500 to create a savings account
    if(bankAccount.getBalance()>=2500){
        SavingAccount savingAccount=new SavingAccount();
        System.out.println("savings account created successfully");
    }
    else{
        throw new insufficientSavingsbalExcepion();
    }
    //check if account has more than 500 to create a checking account
    if(bankAccount.getBalance()>=500){
        CheckingAccount savingAccount=new CheckingAccount();
        System.out.println("Checking account created successfully");
    }
    else{
        throw new insufficientCheckingbalExcepion();
    }

}
}
