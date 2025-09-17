package array;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//      Since all arrays are objects in java, their references can be assigned
//      to a reference variable of Object type. For example:

//        int[] sId = new int[5];
//        Object obj = sId[0] = 10;
//        Object obj1 = sId[1] = 10;
//        Object obj2 = sId[2] = 10;
//        Object obj3 = sId[3] = 10;
//        Object obj4 = sId[4] = 10;
//        Object obj5 = sId[5] = 10;

//      We can also declare an expression to specify the length of an array
//      while creating an array:

//        int length = 10;
//        int[] arr = new int[length];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;
//        arr[5] = 60;
//        arr[6] = 70;
//        arr[7] = 80;
//        arr[8] = 90;
//        arr[9] = 100;

//        System.out.println(arr[]);

       /* Scanner sc = new Scanner(System.in);

        System.out.println("In how many subject have you given exams?");
        int n = sc.nextInt();

        int[] marks = new int[n];
        System.out.println("Enter your marks obtained in subjects: ");

        for(int i = 0; i < n; i++){
            marks[i] = sc.nextInt();
        }

        int total = 0;
        for(int i = 0; i < n; i++){
            total += marks[i];
        }
        System.out.println(total);

        float percentage = (float)total/n;
        System.out.println("Percentage: " +percentage+ "%");*/









        int[][] arr = new int[5][4];
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }















    }
}
