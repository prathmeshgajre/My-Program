package w3resource;

public class Exercise25 {
    static void main() {

        String str = "The quick brown fox jumps over the lazy dog.";

        String newStr = str.replaceAll("brown","black");

        System.out.println(newStr);
    }
}
