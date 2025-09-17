package inheritance.multilevelinheritance;

class Vehicle{
    void move(){
        System.out.println("Vehicle moves..");
    }
}

class Car extends Vehicle{
    void fuelType(){
        System.out.println("Car runs on fuel.");
    }
}

class SportsCar extends Car{
    void accelerate(){
        System.out.println("Sports car accelerate.");
    }
}

public class MultilevelInheritance3 {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.move();
        sportsCar.fuelType();
        sportsCar.accelerate();

    }
}
