package inheritance.multilevelinheritance;

class Shape{
    void draw(){
        System.out.println("drawing shape..");
    }
}

class Rectangle extends Shape{
    void area(){
        System.out.println("area of rectangle.");
    }
}

class Box extends Rectangle{
    void volume(){
        System.out.println("Volume of box..");
    }
}
public class MultilevelInheritance4 {
    public static void main(String[] args) {
        Box box = new Box();
        box.draw();
        box.area();
        box.volume();
    }
}
