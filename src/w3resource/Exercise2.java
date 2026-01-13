package w3resource;

public class Exercise2 {
    static void main() {

        String str = "Java is programming language";

        int a = str.codePointAt(0);
        int b = str.codePointAt(20);

        System.out.println(a);
        System.out.println(b);
    }
}
