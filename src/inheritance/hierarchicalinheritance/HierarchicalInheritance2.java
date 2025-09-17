package inheritance.hierarchicalinheritance;

class Account{
    void open(){
        System.out.println("Account opened.");
    }
}

class SavingAccount extends Account{
    void save(){
        System.out.println("Saving money.");
    }
}

class CurrentAccount extends Account{
    void transact(){
        System.out.println("Transaction done.");
    }
}
public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.open();
        savingAccount.save();

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.open();
        currentAccount.transact();
    }
}
