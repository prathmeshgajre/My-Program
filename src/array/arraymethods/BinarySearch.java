package array.arraymethods;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        //unsorted array giving negative value
        int[ ] list = {14,52,37,95,86,3,67,39,64,40,56,73};
        System.out.println(Arrays.binarySearch(list,14));

        //sorted array gives correct index number
        int[] list1 = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(Arrays.binarySearch(list1,50));

        //Unsorted array after sorting
        int[] list2 = {14,52,37,95,86,3,67,39,64,40,56,73};
        Arrays.sort(list2);
        System.out.println(Arrays.binarySearch(list2,67));

    }
}
