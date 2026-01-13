package ExceptionHandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTask1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Prathm");
        list.add("Jhon");
        list.add("Nick");
        list.add("Joy");

        System.out.println(list);

        list.remove("Jhon");

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
