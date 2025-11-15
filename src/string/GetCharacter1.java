package string;

public class GetCharacter1 {
    static void main() {

        String str = new String("Java Technology");
        System.out.println(str);

        char ch0 = str.charAt(0);
        char ch4 = str.charAt(4);
        char ch8 = str.charAt(8);
        char ch9 = str.charAt(9);

        /*System.out.println(ch0);
        System.out.println(ch4);
        System.out.println(ch8);
        System.out.println(ch9);
*/

        char arr[] = {'a','b','c','d'};
        String s = new String(arr);
        String s1 = new String(arr,1,3);
        System.out.println(s);
        System.out.println(s1);

        String s2 = new String("Hello");
        String s3 = s2.concat(" world");
        System.out.println(s2);                                 //return string value
        System.out.println(s3);

        String str1 = "Hello Java";
        System.out.println(str1.equals("Hello Java"));          //return boolean value

        System.out.println(str1.equalsIgnoreCase("hello java")); // not case-sensitive


    }
}
