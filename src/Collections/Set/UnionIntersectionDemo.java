package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDemo {
    public static void main(String[] args) {

        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);

        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        System.out.println(setA);
        System.out.println(setB);

        System.out.println(union);
        System.out.println(intersection);

    }
}
