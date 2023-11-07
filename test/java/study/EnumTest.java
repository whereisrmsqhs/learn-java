package study;

import org.junit.jupiter.api.Test;

public class EnumTest {

    @Test
    void useValues() {
        Rank[] values = Rank.values();
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println(Rank.valueOf("THREE"));
    }

    @Test
    void useOrdinal() {
        Rank[] values = Rank.values();
        for(int i = 0; i< values.length; i++) {
            System.out.println(values[i] + "인덱스는 : " + values[i].ordinal());
        }
        Statistic rank = Statistic.getRank(3);
        System.out.println(rank);
    }
}
