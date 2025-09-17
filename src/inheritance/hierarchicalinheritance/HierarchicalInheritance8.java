package inheritance.hierarchicalinheritance;

class Device{
    void start(){
        System.out.println("Device starts.");
    }
}

class Mobile extends Device{
    void call(){
        System.out.println("Making a call.");
    }
}

class Laptop extends Device{
    void code(){
        System.out.println("Coding on laptop.");
    }
}
public class HierarchicalInheritance8 {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.start();
        mobile.call();

        Laptop laptop = new Laptop();
        laptop.start();
        laptop.code();
    }
}
