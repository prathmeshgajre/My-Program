package w3resource;

public class Exercise3 {
    static void main() {

        String str = "Java Programming";

        int v1 = str.codePointBefore(1);

        int v2 = str.codePointBefore(5);

        System.out.println(v1);
        System.out.println(v2);
    }
}
