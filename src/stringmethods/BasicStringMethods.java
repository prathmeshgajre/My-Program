package stringmethods;

public class BasicStringMethods {
    static void main() {

        String str = " Hello Camper ";

        int s1 = str.length();
        System.out.println(s1);
        //It gives length of string including spaces in the string.

        int s2 = str.charAt(7);
        char ch = str.charAt(7);
        System.out.println(s2);     //Here we get ASCII value of that character because we store in int.
        System.out.println(ch);     //Here we get Character of that index number which is on 7.

        boolean b1 = str.isEmpty();
        System.out.println(b1);
        //It checks string is empty or not based on that it will give boolean answer either true or false.

        String s3 = str.trim();
        System.out.println(s3);
        //It removes starting and ending whitespaces from the string.

        String s4 = str.toUpperCase();
        System.out.println(s4);
        //It coverts string into UpperCase(Capital later).

        String s5 = str.toLowerCase();
        System.out.println(s5);
        //It converts string into LowerCase(Small later).


    }
}
