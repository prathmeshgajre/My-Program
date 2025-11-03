package stringmethods;

public class StaticStringMethods {
    public static void main(String[] args) {

        // valueOf()
        int number = 100;
        String num = String.valueOf(number);
        System.out.println(num);

        // join()
        String joined = String.join("-", "A", "B", "C");
        System.out.println(joined);

        // format()
        String format = String.format("Number: %d, Word: %s", 10, "Java");
        System.out.println(format);

        // intern()
        String s1 = new String("Hello");
        String s2 = s1.intern();
        System.out.println(s2);

        // hashCode()
        System.out.println(s1.hashCode());
    }
}
