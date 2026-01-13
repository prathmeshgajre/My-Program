package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class SetIteratorDemo {
    public static void main(String[] args) {

        HashSet<String> items = new HashSet<>();

        items.add("Pen");
        items.add("Book");
        items.add("Laptop");

        Iterator<String> it = items.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
