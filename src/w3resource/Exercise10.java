package w3resource;

public class Exercise10 {
    static void main() {

        String str1 = "Java Program" , str2 = "java program";

        StringBuffer sb = new StringBuffer(str1);

        System.out.println(str1.contentEquals(sb));
        System.out.println(str2.contentEquals(sb));
    }
}
