package Practice.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;

public class Program1 {

    public static void main(String[] args) {

        String s = "I am learning stream API in Java";

        String ans = Arrays.stream(s.split("")).max(Comparator.comparing(String::length)).get();

        System.out.print(ans);
    }
}
