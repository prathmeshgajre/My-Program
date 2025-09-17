package array.arraymethods;

import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {

        int[] num1 = {1,3,5,7,9};
        int[] num2 = {1,3,7,7,9};
        int[] num3 = {1,3,5,7,9};

        System.out.println(Arrays.compare(num1,num2));
        System.out.println(Arrays.compare(num2,num1));
        System.out.println(Arrays.compare(num1,num3));
    }
}
