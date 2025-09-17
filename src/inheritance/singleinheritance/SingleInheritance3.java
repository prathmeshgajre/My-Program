package inheritance.singleinheritance;

class Vehicle{
    void move(){
        System.out.println("Car is moving.");
    }
}

class Car extends Vehicle{
    void speed(){
        System.out.println("Car in speed.");
    }

}
public class SingleInheritance3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.speed();
    }
}
