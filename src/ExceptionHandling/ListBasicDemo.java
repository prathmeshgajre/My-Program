package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class ListBasicDemo {
    public static void main(String[] args) {

        List<String> name = new ArrayList<String>();

        name.add("Ram");
        name.add("Shyam");
        name.add("Mohan");

        System.out.println(name);

        System.out.println(name.get(0));
        System.out.println(name.isEmpty());


    }
}
