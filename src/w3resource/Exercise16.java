package w3resource;

public class Exercise16 {
    static void main() {

        String str = "Java is a Programming Language";

        byte[] bt = str.getBytes();

        String res = new String(bt);

        System.out.println(res);
    }
}
