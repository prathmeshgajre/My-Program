package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,2,3,4,4,5,6,6);

        Set<Integer> unique = new HashSet<Integer>(nums);

        System.out.println(unique);
    }
}
