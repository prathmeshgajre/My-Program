package inheritance.multilevelinheritance;

class Account{
    void open(){
        System.out.println("Account opened.");
    }
}

class SavingAccount extends Account{
    void deposit(){
        System.out.println("Depositing in saving account.");
    }
}

class FixedDeposit extends SavingAccount{
    void calculateInterest(){
        System.out.println("Calculating fixed deposit interest.");
    }
}
public class MultilevelInheritance5 {
    public static void main(String[] args) {
        FixedDeposit fixedDeposit = new FixedDeposit();
        fixedDeposit.open();
        fixedDeposit.deposit();
        fixedDeposit.calculateInterest();
    }
}
