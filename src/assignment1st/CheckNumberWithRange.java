package assignment1st;
import java.util.Scanner;

public class CheckNumberWithRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        double num = sc.nextDouble();

        System.out.println("Input value: " + num);

        if(num == 0){
            System.out.println("zero");
        } else {
            if (num > 0)
            System.out.println("Positive ");
            else
            System.out.println("Negative ");

            if (Math.abs(num) < 1)
                System.out.println("Number is Small");
            else if (Math.abs(num) > 1000000)
                System.out.println("Number is Large");
            else
                System.out.println("Number");
            }
    }
}