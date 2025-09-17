package inheritance.singleinheritance;

class Employee{
    void work(){
        System.out.println("Employee is working..");
    }
}

class Manager extends Employee{
    void manage(){
        System.out.println("Manager manage teams..");
    }
}
public class SingleInheritance5 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.work();
        manager.manage();
    }
}
