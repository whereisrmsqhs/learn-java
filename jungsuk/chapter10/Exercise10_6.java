package jungsuk.chapter10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise10_6 {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(2000, 1, 1);
        LocalDate now = LocalDate.now();

        long until = birthDay.until(now, ChronoUnit.DAYS);

        System.out.println("birthDay=" + birthDay);
        System.out.println("now="+now);
        System.out.println("until="+until);
    }
}
