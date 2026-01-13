package Collections.Set;

import java.util.TreeSet;

public class TreeSetCustomSort {
    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<String>((a,b)->a.length()-b.length());

        set.add("Java");
        set.add("AI");
        set.add("Backend");
        set.add("Go");

        System.out.println(set);
    }
}
