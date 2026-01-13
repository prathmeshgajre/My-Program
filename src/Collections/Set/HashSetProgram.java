package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetProgram {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(45);
        set.add(69);
        set.add(57);
        set.add(45);    //Duplicates are not allowed
        set.add(null);  //null is Allowed. But only once.
        set.add(null);


        System.out.println(set);
        //Insertion order is not Preserved.

        HashSet<Object> hashSet = new HashSet<>();

        hashSet.add(45);
        hashSet.add(69);
        hashSet.add("Prathm");
        hashSet.add(null);
        hashSet.add(true);
        hashSet.add(new Object());
        //Heterogeneous are allowed.
        //Initial capacity is 16
        //Load factor is 0.75
        //add(E e) - Adds an element

    }
}
