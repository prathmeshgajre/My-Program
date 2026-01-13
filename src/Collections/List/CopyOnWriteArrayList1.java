package Collections.List;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList1 {
    public static void main(String[] args) {
        CopyOnWriteArrayList <String> fruits  = new CopyOnWriteArrayList();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println(fruits);

        for (String item : fruits){
            System.out.println(item);
            if (item.equals("Banana")){
                fruits.add("Mango");
                System.out.println("1 more added");
            }
        }
        System.out.println(fruits);
    }
}
