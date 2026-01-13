package w3resource;

public class Exercise11 {
    static void main() {

        char[] arr = new char[] {'1','2','3','4'};

        String str = String.copyValueOf(arr,1,3);

        System.out.println(str);
    }
}
