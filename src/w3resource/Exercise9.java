package w3resource;

public class Exercise9 {
    static void main() {
        String str1 = "java program" , str2 = "Java Program";

        CharSequence cs = "java program";

        System.out.println(str1.contentEquals(cs));
        System.out.println(str2.contentEquals(cs));
    }


}
