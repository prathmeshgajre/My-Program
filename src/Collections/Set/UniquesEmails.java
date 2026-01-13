package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniquesEmails {
    public static void main(String[] args) {

        List<String> emails = Arrays.asList( "test@gmail.com",
                "admin@test.com",
                "test@gmail.com",
                "user@abc.com");

        Set<String> uniqueEmails = new HashSet<>(emails);

        for (String mail : emails){
            System.out.println(mail);
        }
    }
}
