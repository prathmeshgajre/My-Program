package assignment1st;

import java.util.Scanner;

public class CompareFloats {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input floating point number : ");
        double num1 = sc.nextDouble();
        System.out.print("Input another floating point number : ");
        double num2 = sc.nextDouble();

        num1 = Math.round(num1 * 1000);
        num2 = Math.round(num2 * 1000);

        if (num1 == num2)
            System.out.println("Same upto three decimal places");
        else
            System.out.println("They are Different");
    }
}
