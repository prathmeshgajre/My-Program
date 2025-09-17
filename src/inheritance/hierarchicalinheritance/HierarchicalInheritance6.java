package inheritance.hierarchicalinheritance;

class Vehicle{
    void move(){
        System.out.println("Vehicle moves.");
    }
}

class Car extends Vehicle{
    void fuelType(){
        System.out.println("Car uses petrol.");
    }
}

class Bike extends Vehicle{
    void kickStart(){
        System.out.println("Bike kick-starts.");
    }
}

public class HierarchicalInheritance6 {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.fuelType();

        Bike bike = new Bike();
        bike.move();
        bike.kickStart();
    }
}
