package inheritance.singleinheritance;

class Computer{
    void process(){
        System.out.println("Computer processes data");
    }
}

class Laptop extends Computer{
    void portable(){
        System.out.println("Laptop is portable.");
    }

}
public class SingleInheritance9 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.process();
        laptop.portable();
    }
}
