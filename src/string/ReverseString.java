package string;

public class ReverseString {
    static void main() {

        String str = "Hello";
        String reversed = "";


        StringBuffer reverse = new StringBuffer(str).reverse();
        System.out.println(reverse);

        StringBuilder sb = new StringBuilder(str).reverse();
        System.out.println(sb);

        for (int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        System.out.println(reversed);

        System.out.println(Character.isWhitespace('\u00A0'));
        System.out.println(str.trim());


    }
}