package assignment1st;

import java.util.Scanner;

public class PrintingCopies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of copies: ");
        int noOfCopies = sc.nextInt();

        if (noOfCopies > 0 && noOfCopies <= 99){
            double pricePerCopy = 0.30;
            System.out.println("Price per Copy: " + pricePerCopy);
            double totalPrice = noOfCopies * pricePerCopy;
            System.out.println("Total cost is: " + totalPrice);

        } else if (noOfCopies >= 100 && noOfCopies < 500) {
            double pricePerCopy = 0.28;
            System.out.println("Price per Copy: " + pricePerCopy);
            double totalPrice = noOfCopies * pricePerCopy;
            System.out.println("Total cost is: " + totalPrice);

        } else if (noOfCopies >= 500 && noOfCopies < 800) {
            double pricePerCopy = 0.27;
            System.out.println("Price per Copy: " + pricePerCopy);
            double totalPrice = noOfCopies * pricePerCopy;
            System.out.println("Total cost is: " + totalPrice);

        } else if (noOfCopies >= 800 && noOfCopies <= 1000) {
            double pricePerCopy = 0.26;
            System.out.println("Price per Copy: " + pricePerCopy);
            double totalPrice = noOfCopies * pricePerCopy;
            System.out.println("Total cost is: " + totalPrice);

        }else {
            double pricePerCopy = 0.25;
            System.out.println("Price per Copy: " + pricePerCopy);
            double totalPrice = noOfCopies * pricePerCopy;
            System.out.println("Total cost is: " + totalPrice);
        }
    }
}
