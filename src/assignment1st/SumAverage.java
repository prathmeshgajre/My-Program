package assignment1st;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNum = 0;

        System.out.println("Enter the number: ");

        for(int i=1; i<=5; i++) {
            System.out.print("Number " + i + ": ");
            int num = sc.nextInt();
            totalNum += num;
        }

        double average = (double)totalNum / 5;

        System.out.println("Total: " + totalNum);
        System.out.println("Average: " + average);
    }
}
