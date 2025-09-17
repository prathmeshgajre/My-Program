package assignment1st;

import java.util.Scanner;

public class CheckWeather {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature: ");
        int temp = sc.nextInt();

        if (temp >= 45){
            System.out.println("Weather is Hot");
        }else if (temp >= 25 && temp < 45 ){
            System.out.println("Weather is Moderate");
        }else {
            System.out.println("Weather is Cold");
        }
    }
}
