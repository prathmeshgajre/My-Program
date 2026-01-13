package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

/*

        //collection --> stream
        List<String> list = Arrays.asList("Apple","Banana","Cherry");
        list.stream();

        //array --> stream
        String[] array = {"Apple","Banana","Cherry"};
        Arrays.stream(array);

        //create stream directly by , separate
        Stream<Integer> integerStream = Stream.of(20,40,60);

        //generate/iterate a loop by using stream.iterate
        Stream<Integer> iterate = Stream.iterate(0, n -> n + 1).limit(100);

        //We can generate using the help of supplier
        Stream<String> limit = Stream.generate(() -> "Hello").limit(5);
        Stream<Integer> limit1 = Stream.generate(() -> (int)Math.random() * 50).limit(5);

*/
    public static void main(String[] args) {

        //filter() --> use Predicate for conditions
        List<Integer> list = Arrays.asList(1, 45, 95, 78, 63, 15, 48, 95, 52, 36, 24);
        List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredList);
        //map() --> use Function for input and output operations
        //collect(Collectors.toList()) --> use to convert into Collection List
        List<Integer> mappedList = filteredList.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(mappedList);

        //We can do both operations in one line
        List<Integer> filteredList1 = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).collect(Collectors.toList());
        System.out.println(filteredList1);

        //distinct() --> Used to Remove Duplicates
        List<Integer> filteredList2 = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().collect(Collectors.toList());
        System.out.println(filteredList2);

        //sorted() --> To get output in Sorting Order(ascending order)
        List<Integer> filteredList3 = list.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().sorted().collect(Collectors.toList());
        System.out.println(filteredList3);

        //sorted((a, b) -> (b - a)) --> To get output in Sorted Descending Order.
        List<Integer> filteredList4 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> (b - a))
                .collect(Collectors.toList());
        System.out.println(filteredList4);

        //limit() --> Used to fix limit
        List<Integer> filteredList5 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> (b - a))
                .limit(2) //How much element you want from start
                .collect(Collectors.toList());
        System.out.println(filteredList5);

        //skip() --> Used to skip elements
        List<Integer> filteredList6 = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .sorted((a, b) -> (b - a))
                .limit(2)
                .skip(1) // How many element you want to skip from start.
                .collect(Collectors.toList());
        System.out.println(filteredList6);

        //peek() --> Performs action without modifying stream (mainly for debugging).






    }
}