package Java8.Streams.Part1;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "apple", "avocado", "", null, "grape", "orange123");

        //1. Convert to uppercase, sort, and print
        strings.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        //2. Get count of strings where length > 5
        long count = strings.stream()
                .filter(s -> s != null && s.length() > 5)
                .count();
        System.out.println("Count of strings with length > 5: " + count);

        //3. Remove Duplicates
        List<String> uniqueString = strings.stream()
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique strings: " + uniqueString);

        //4. Get string containing a specific word (e.g., "apple)\
        List<String> containingWord = strings.stream()
                .filter(s -> s != null && s.contains("apple"))
                .collect(Collectors.toList());
        System.out.println("Containing word: " + containingWord);

        //5. Remove strings starting with a specific word (e.g., "a")
        List<String> startsWith = strings.stream()
                .filter(s -> s != null && s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("Starting with: " + startsWith);

        //6. Find first element starting with a specific word (e.g., "b")
        strings.stream()
                .filter(s -> s != null && s.startsWith("b"))
                .findFirst()
                .ifPresent(System.out::println);

        //7. Get the length of each string
        List<Integer> length = strings.stream()
                .filter(Objects::nonNull)
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Length: " + length);

        //8. Sort by length
        List<String> sortedByLength = strings.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Sorted: " + sortedByLength);

        //9. Find the longest word
        strings.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingInt(String::length))
                .ifPresent(System.out::println);

        //10. Get string containing vowels
        List<String> withVowels = strings.stream()
                .filter(s -> s != null && s.matches(".*[aeiouAEIOU].*"))
                .collect(Collectors.toList());
        System.out.println("With Vowels: " + withVowels);

        //11. Convert list into comma-separated string
        String commaSeparated = strings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.joining(", "));
        System.out.println("CommaSeparated: " + commaSeparated);

        //12. Reverse each tring
        List<String> reversedString = strings.stream()
                .filter(Objects::nonNull)
                .map(s -> new StringBuffer(s).reverse().toString())
                .collect(Collectors.toList());
        System.out.println("Reversed: " + reversedString);

        //13. Remove empty and null strings
        List<String> nonEmptyStrings = strings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println("Non Empty Strings: " + nonEmptyStrings);

        //14. Group by first letter
        /*Map<Character, List<String>> groupByFirstLetter = strings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println("Grouped by First Letter: " + groupByFirstLetter);*/

        //15. Group by length
        Map<Integer, List<String>> groupByLength = strings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by length: " + groupByLength);

        //16. Map with first letter as key
        /*Map<Character, List<String>> firstLetterMap = strings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println("First Letter Map: " + firstLetterMap);
*/
        //17. Group with vowels and non-vowels
        Map<Boolean, List<String>> vowelsGroup = strings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.partitioningBy(s -> s.matches(".*[aeiouAEIOU].*")));
        System.out.println("Grouped by vowels: " + vowelsGroup);

        //18. Print strings without digits
        List<String> noDigits = strings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println("No digits: " + noDigits);







}


}
