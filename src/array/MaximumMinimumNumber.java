package array;

public class MaximumMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {1,5,7,9,11,-3,2,-10,19};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("largest number: " + max);
        System.out.println("smallest number: " + min);
    }
}
