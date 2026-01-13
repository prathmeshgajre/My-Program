package w3resource;

public class Exercise20 {
    static void main() {

        String str1 = "Java Exercises";
        String str2 = new StringBuffer("Java").append(" Exercises").toString();
        String str3 = str2.intern();

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}
