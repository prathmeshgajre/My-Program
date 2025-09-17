package inheritance.multilevelinheritance;

class LivingBeing{
    void grow(){
        System.out.println("Living being grows.");
    }
}

class Animal1 extends LivingBeing{
    void move(){
        System.out.println("Animal moves.");
    }
}

class Bird extends Animal1{
    void fly(){
        System.out.println("Bird flies.");
    }
}
public class MultilevelInheritance7 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.grow();
        bird.move();
        bird.fly();
    }
}
