package assignment1st;

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("Eligible for Vote");
        }else {
            System.out.println("Not Eligible");
        }
    }
}
