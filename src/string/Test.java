package string;

import java.sql.SQLOutput;

public class Test {
    static void main() {
        String a = "A";
        String s = 'A' + a + "A";
        String s1 = a + 'A' + "A";
        String s2 = "A" + 'A' + a;
        System.out.println(s);
        System.out.println(s2);

        String s4 = "ABCD";
        char[] arr = s4.toCharArray();
        System.out.println(arr);
        System.out.println('a');
        System.out.println("a"+'a');

        System.out.println((int)'a');
        System.out.println("a"+(int)'a');
    }
}
