package inheritance.multilevelinheritance;

class Animal{
    void eat(){
        System.out.println("Animal eats.");
    }
}

class Mammal extends Animal{
    void breathe(){
        System.out.println("Mammal breathes.");
    }
}

class Dog extends Mammal{
    void bark(){
        System.out.println("Dog barks..");
    }
}

public class MultilevelInheritance1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.breathe();
        dog.bark();
    }
}
