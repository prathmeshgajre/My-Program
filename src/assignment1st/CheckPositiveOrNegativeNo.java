package assignment1st;

import java.util.Scanner;

public class CheckPositiveOrNegativeNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = sc.nextInt();

        if (num >= 0){
            System.out.println("It is a Positive Number.");
        }else {
            System.out.println("It is a Negative Number.");
        }

    }
}