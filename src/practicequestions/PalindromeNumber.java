package practicequestions;

import java.util.Scanner;

public class PalindromeNumber {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int num = sc.nextInt();
        int org_num = num;

        int rev=0;

        while (num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        if (org_num == rev){
            System.out.println("It is palindrome");
        }else {
            System.out.println("Not palindrome");
        }

    }
}
