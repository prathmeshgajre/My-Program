package inheritance.singleinheritance;

class Account{
    void accountType(){
        System.out.println("General Account..");
    }
}

class SavingAccount extends Account{
    void interestRate(){
        System.out.println("Saving account interest is 4%");
    }
}
public class SingleInheritance6 {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.accountType();
        savingAccount.interestRate();
    }
}
