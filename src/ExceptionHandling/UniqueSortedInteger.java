package ExceptionHandling;

import java.util.*;

public class UniqueSortedInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Set<Integer> set = new HashSet<Integer>(list);

        List<Integer> uniqueList = new ArrayList<Integer>(set);

        Collections.sort(uniqueList);

        System.out.println("Unique Sorted integers:");
        for (int num : uniqueList){
            System.out.println(num + " ");
        }
    }
}
