package practicequestions;

import java.util.Scanner;

public class PalindromeString {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String ");

        String str = sc.next();
        String org_str = str;

        String rev = "";
        int len = str.length();

        for (int i=len-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        if (org_str.equals(rev)){
            System.out.println("Palindrome String");
        }else {
            System.out.println("Not Palindrome String");
        }
    }
}
