package Collections.Set;

import java.util.HashSet;

public class UniqueVoterIDs {
    public static void main(String[] args) {

        HashSet<Integer> voterId = new HashSet<Integer>();

        int[] ids = {101,102,103,101,104,102};

        for (int id : ids){
            voterId.add(id);
        }
        System.out.println(voterId);
    }
}
