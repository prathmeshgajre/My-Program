package Java8.DateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        LocalDate now =  LocalDate.now();
        System.out.println(now);

        LocalDate now1 = LocalDate.of(2020, 1, 1);
        System.out.println(now1);

        int dayOfMonth = now.getDayOfMonth();
        Month month = now.getMonth();
        int year = now.getYear();

    }
}
