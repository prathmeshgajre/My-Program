package practicequestions;

import java.util.Scanner;

public class ReverseNumber {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();

        /*int rev = 0;
        while (num!=0){
            rev = rev*10 + num%10;
            num=num/10;
        }
        System.out.println("Reverse number is " + rev);*/

        /*StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println("Reverse number is " +rev);*/

        StringBuilder sb1 = new StringBuilder();
        sb1.append(num);
        StringBuilder rev = sb1.reverse();
        System.out.println("Reverse number is " +rev);



    }
}
