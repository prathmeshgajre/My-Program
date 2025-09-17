package inheritance.hierarchicalinheritance;

class Animal{
    void eat(){
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat meow.");
    }
}
public class HierarchicalInheritance1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
