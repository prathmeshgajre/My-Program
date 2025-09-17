package assignment1st;

import java.util.Scanner;

public class FindGreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("First Number "+ num1 + " Is the Greatest Number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Second Number "+ num2 + " Is the Greatest Number");
        }else {
            System.out.println("Third Number "+ num3 + " Is the Greatest Number");
        }
        sc.close();
    }
}
