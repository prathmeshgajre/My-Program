package Collections.Set;

import java.util.HashSet;

public class HashSetBasic {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<String>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");   //Duplicates ignored

        System.out.println(fruits);

        fruits.remove("Apple");

        System.out.println(fruits.contains("Mango"));
        System.out.println(fruits.size());
    }
}
