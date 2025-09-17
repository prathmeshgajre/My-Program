package inheritance.hierarchicalinheritance;

class Employee{
    void login(){
        System.out.println("Employee logged in.");
    }
}

class Developer extends Employee{
    void writeCode(){
        System.out.println("Developer writes code.");
    }
}

class Tester extends Employee{
    void testCode(){
        System.out.println("Tester tests Software.");
    }
}
public class HierarchicalInheritance7 {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.login();
        developer.writeCode();

        Tester tester = new Tester();
        tester.login();
        tester.testCode();
    }
}
