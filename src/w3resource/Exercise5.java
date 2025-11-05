package w3resource;

public class Exercise5 {
    static void main() {

        String st1 = "Java 1";
        String st2 = "Java 2";

        int result = st1.compareTo(st2);
        System.out.println(result);

        if (result < 0){
            System.out.println(st1 + " is less than "+ st2);
        } else if (result == 0) {
            System.out.println(st1 + " is equal to "+ st2);
        }else {
            System.out.println(st1 + " is greater than "+ st2);
        }
    }
}
