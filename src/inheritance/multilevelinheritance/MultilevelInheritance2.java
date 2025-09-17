package inheritance.multilevelinheritance;

class Person{
    void speak(){
        System.out.println("Person speaks..");
    }
}
class Employee extends Person{
    void work(){
        System.out.println("Employee is working..");
    }
}

class Manager extends Employee{
    void manage(){
        System.out.println("Manager manage team..");
    }
}
public class MultilevelInheritance2 {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.speak();
        manager.work();
        manager.manage();
    }
}
