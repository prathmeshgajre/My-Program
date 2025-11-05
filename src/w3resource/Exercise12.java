package w3resource;

public class Exercise12 {
    static void main() {

        String str1 = "Java Program", str2 = "Java Programs";

        String result = "ms";

        boolean end1 = str1.endsWith(result);
        boolean end2 = str2.endsWith(result);

        System.out.println(end1);
        System.out.println(end2);
    }
}
