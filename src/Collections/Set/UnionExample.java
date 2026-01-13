package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionExample {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> b = new HashSet<>(Arrays.asList(3,4,5));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);

        System.out.println(union);
    }
}
