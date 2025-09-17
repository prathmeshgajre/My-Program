package inheritance.multilevelinheritance;

class Employee1{
    void login(){
        System.out.println("Employee logged in.");
    }
}

class Developer extends Employee1{
    void code(){
        System.out.println("Developer writes code.");
    }
}

class AndroidDeveloper extends Developer{
    void buildApp(){
        System.out.println("Android developer builds apps.");
    }
}
public class MultilevelInheritance8 {
    public static void main(String[] args) {
        AndroidDeveloper androidDeveloper = new AndroidDeveloper();
        androidDeveloper.login();
        androidDeveloper.code();
        androidDeveloper.buildApp();
    }
}
