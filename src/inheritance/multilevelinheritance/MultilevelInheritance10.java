package inheritance.multilevelinheritance;

class Appliance{
    void start(){
        System.out.println("Appliance started.");
    }
}

class KitchenAppliance extends Appliance{
    void useInKitchen(){
        System.out.println("Using in kitchen.");
    }
}

class Blender extends KitchenAppliance{
    void blend(){
        System.out.println("Blending ingredients.");
    }
}
public class MultilevelInheritance10 {
    public static void main(String[] args) {
        Blender blender = new Blender();
        blender.start();
        blender.useInKitchen();
        blender.blend();
    }
}
