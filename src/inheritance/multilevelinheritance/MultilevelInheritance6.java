package inheritance.multilevelinheritance;

class Device{
    void powerOn(){
        System.out.println("Device powered on.");
    }
}

class Computer extends Device{
    void compute(){
        System.out.println("Computer computes.");
    }
}

class Laptop extends Computer{
    void carry(){
        System.out.println("Laptop is portable.");
    }
}
public class MultilevelInheritance6 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.compute();
        laptop.carry();
    }

}
