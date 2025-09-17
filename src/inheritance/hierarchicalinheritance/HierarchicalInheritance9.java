package inheritance.hierarchicalinheritance;

class Bird{
    void fly(){
        System.out.println("Birds flies.");
    }
}

class Parrot extends Bird{
    void mimic(){
        System.out.println("Parrot mimics.");
    }
}

class Sparrow extends Bird{
    void chirp(){
        System.out.println("Sparrow chirp.");
    }
}
public class HierarchicalInheritance9 {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.mimic();

        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.chirp();
    }
}
