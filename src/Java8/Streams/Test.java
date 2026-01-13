package Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream().filter(x -> x % 2 == 0).map(x -> x * x).forEach(System.out::print);
        System.out.println("=====================");

        List<Integer> list1 = List.of(20,64,86,43,92,50,15,38,43,28,95,17);
        list1.stream().filter(i -> i > 50);



    }
}
