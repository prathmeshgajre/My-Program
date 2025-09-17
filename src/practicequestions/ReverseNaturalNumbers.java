package practicequestions;

import java.util.Scanner;

public class ReverseNaturalNumbers {
    public static void main(String[] args) {

        //Write a program to print all natural numbers in reverse
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
