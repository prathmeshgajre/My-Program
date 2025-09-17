package inheritance.singleinheritance;

class Bird{
    void fly(){
        System.out.println("Bird can fly..");
    }
}

class Parrot extends Bird{
    void speak(){
        System.out.println("Parrot can mimic sound..");
    }
}
public class SingleInheritance8 {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.speak();
    }
}
