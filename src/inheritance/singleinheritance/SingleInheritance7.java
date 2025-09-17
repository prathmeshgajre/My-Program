package inheritance.singleinheritance;

class Appliance{
    void powerOn(){
        System.out.println("Appliance is on.");
    }
}

class WashingMachine extends Appliance{
    void washClothes(){
        System.out.println("Washing clothes.");
    }
}
public class SingleInheritance7 {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.powerOn();
        washingMachine.washClothes();
    }
}
