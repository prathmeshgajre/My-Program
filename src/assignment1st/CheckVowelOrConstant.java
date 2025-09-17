package assignment1st;

import java.util.Scanner;

public class CheckVowelOrConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Alphabet: ");
        String alphabet = sc.next();


        boolean vowels = alphabet.equals("a") || alphabet.equals("A") ||
                         alphabet.equals("e") || alphabet.equals("E") ||
                         alphabet.equals("i") || alphabet.equals("I") ||
                         alphabet.equals("o") || alphabet.equals("O") ||
                         alphabet.equals("u") || alphabet.equals("U");

        if(vowels){
            System.out.println("It is a Vowels");
        } else if (alphabet.length() > 1) {
            System.out.println("Error, Please enter right value");
        } else {
            System.out.println("It is a Constant");
        }

        sc.close();
    }
}
