package Collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {


    public static void main(String[] args) {
        LinkedHashSet<String> languages = new LinkedHashSet<String>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");

        System.out.println(languages);
    }
}
