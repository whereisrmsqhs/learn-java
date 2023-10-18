package jungsuk.chapter10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_5 {

    public static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
        String pattern = "yyyyMMdd";
        DateFormat df = new SimpleDateFormat(pattern);
        Date parse1, parse2;
        try {
            parse1 = df.parse(yyyymmdd1);
            parse2 = df.parse(yyyymmdd2);
        } catch (ParseException e) {
            return 0;
        }
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal.setTime(parse1);
        cal2.setTime(parse2);

        return (int) ((cal.getTimeInMillis() - cal2.getTimeInMillis()) / (60*60*1000) / 24);
    }
    public static void main(String[] args) {
        System.out.println(getDayDiff("20010103", "20010101"));
        System.out.println(getDayDiff("20010103", "20010103"));
        System.out.println(getDayDiff("20010103", "200103"));
    }
}
