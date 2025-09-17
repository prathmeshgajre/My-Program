package array;

import java.util.Arrays;

public class SecondLargest {
    static void main() {

                int[] arr = {10, 30, 50, 70, 90, 20, 40, 60, 80, 100};

                int first = Integer.MIN_VALUE;
                int second = Integer.MIN_VALUE;

                for (int num : arr) {
                    if (num > first) {
                        second = first; // shift previous max to second
                        first = num;    // update first max
                    } else if (num > second && num != first) {
                        second = num; // update second max if num is smaller than first
                    }
                }
        System.out.println(Arrays.toString(arr));

                if (second == Integer.MIN_VALUE) {
                    System.out.println("No second largest element");
                } else {
                    System.out.println("Second largest element: " + second);
                }
            }
        }