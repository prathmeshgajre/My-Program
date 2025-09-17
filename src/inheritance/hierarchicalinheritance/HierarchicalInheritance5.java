package inheritance.hierarchicalinheritance;

class Appliance{
    void powerOn(){
        System.out.println("Appliance is on.");
    }
}

class Fan extends Appliance{
    void rotate(){
        System.out.println("Fan is rotating.");
    }
}

class Light extends Appliance{
    void glow(){
        System.out.println("light glows.");
    }
}
public class HierarchicalInheritance5 {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.powerOn();
        fan.rotate();

        Light light = new Light();
        light.powerOn();
        light.glow();
    }
}
