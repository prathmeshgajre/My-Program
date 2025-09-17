package inheritance.hierarchicalinheritance;

class Shape{
    void draw(){
        System.out.println("Drawing shapes.");
    }
}

class Circle extends Shape{
    void area(){
        System.out.println("Area = πr²");
    }
}

class Square extends Shape{
    void area(){
        System.out.println("Area = side²");
    }

}
public class HierarchicalInheritance4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.area();
        circle.draw();

        Square square = new Square();
        square.draw();
        square.area();
    }
}
