package assignment1st;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of English: ");
        int engMarks = sc.nextInt();
        System.out.print("Enter the marks of Physics: ");
        int phyMarks = sc.nextInt();
        System.out.print("Enter the marks of Chemistry: ");
        int chemMarks = sc.nextInt();
        System.out.print("Enter the marks of Biology: ");
        int bioMarks = sc.nextInt();
        System.out.print("Enter the marks of Math: ");
        int mathMarks = sc.nextInt();

        float totalMarks = engMarks + phyMarks + chemMarks + bioMarks + mathMarks;
        System.out.println("Total marks of five subject: " + totalMarks);
        float myPer = totalMarks / 5;
        System.out.println("My percentage is: " + myPer);

        if (myPer >= 80){
            System.out.println("Grade A");
        }else if (myPer >= 60){
            System.out.println("Grade B");
        }else {
            System.out.println("Grade C");
        }

    }
}
