package Collections.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<Integer>();

        marks.add(88);
        marks.add(45);
        marks.add(99);
        marks.add(45);

        System.out.println(marks);

        System.out.println(marks.first());
        System.out.println(marks.last());
    }
}
