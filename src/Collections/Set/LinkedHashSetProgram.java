package Collections.Set;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class LinkedHashSetProgram {
    public static void main(String[] args) {

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(45);
        linkedHashSet.add(30);
        linkedHashSet.add(55);
        linkedHashSet.add(12);
        //Insertion order is Preserved.

        System.out.println(linkedHashSet);

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(45);
        sortedSet.add(30);
        sortedSet.add(55);
        sortedSet.add(12);
        System.out.println(sortedSet);
    }
}
