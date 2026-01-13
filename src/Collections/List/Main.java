package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A","B","C"));

        //Adding Elements

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.add(1,"Mango");
        list.addAll(list1);
        list.addAll(2,Arrays.asList("Orange","Pineapple"));

        System.out.println(list);

        //Accessing Elements

        System.out.println(list.get(2));
        System.out.println(list.indexOf("Apple"));
        System.out.println(list.lastIndexOf("X"));

        //Checking Properties

        System.out.println(list.contains("Banana"));
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        //Removing Elements

        list.remove("X");//remove by value
        list.remove(3);//remove by index
        list.removeAll(Arrays.asList("Y","Z"));//remove multiple
        list.retainAll(Arrays.asList("Apple","Mango","Cherry"));//keep only these
        System.out.println(list);

        //Iteration Methods

        System.out.println();
        for (String s : list)
            System.out.println(s);

        Iterator<String> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        ListIterator<String> li = list.listIterator();
        while (li.hasNext())
            System.out.println(li.next());

        //Conversion

        Object[] arr = list.toArray();
        String[] str = list.toArray(new String[0]);
        System.out.println(Arrays.toString(str));

        //Searching

        System.out.println(list.contains("Apple"));

        //Clearing
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());

        /*list.add(4,50);
        list.add(3,90);*/

        //list.addAll(list);
    }
}
