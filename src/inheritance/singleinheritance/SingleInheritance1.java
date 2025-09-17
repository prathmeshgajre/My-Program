package inheritance.singleinheritance;

class Animal{
    void eat(){
        System.out.println("Animal eats food..");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks..");
    }

}
public class SingleInheritance1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
