package practicequestions;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {

        //Write a program to print all natural numbers from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
