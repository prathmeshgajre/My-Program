package Collections.Set;

import java.util.TreeSet;

public class StudentRollNumbers {
    public static void main(String[] args) {

        TreeSet<Integer> rolls = new TreeSet<>();

        rolls.add(59);
        rolls.add(12);
        rolls.add(78);
        rolls.add(12);

        System.out.println(rolls);
    }
}
