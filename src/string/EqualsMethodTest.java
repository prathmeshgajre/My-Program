package string;

public class EqualsMethodTest {
    static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";

        String s3 = new String("Good Bye");
        String s4 = new String("Hello");

        System.out.println(s1.equals(s2));

        System.out.println(s1.equals(s3));

        System.out.println(s1.equals(args));

        System.out.println(s1.equals(null));

        String s5 = "Hello";
        String s6 = s5.concat(" Java");
        System.out.println(s6);

        String s7 = new String("Java");
        s7.concat(" Programming");
        s7 = s7.concat(" Language");
        System.out.println(s7);
    }
}
