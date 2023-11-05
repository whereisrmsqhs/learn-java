package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class StringTest {

    String inputNumbersWithComma;

    @BeforeEach
    void initInputStrings(){
        inputNumbersWithComma = "1,2";
    }

    @Test
    @DisplayName("문자열 split으로 나누어 테스트하기")
    void StringSplit() {
        String[] numbers = inputNumbersWithComma.split(",");

        Assertions.assertThat(numbers[0]).isEqualTo("1");
    }

    @Test
    @DisplayName("문자열 split으로 나누어 contains()으로 테스트하기")
    void StringSplitAndTestWithContains() {
        String[] numbers = inputNumbersWithComma.split(",");

        Assertions.assertThat(numbers).contains("1");
    }

    @Test
    @DisplayName("문자열 split으로 나누어 containsExactly()으로 테스트하기")
    void StringSplitAndTestWithContainsExactly() {
        String[] numbers = inputNumbersWithComma.split(",");

        String[] expectedResults = new String[]{"1", "2"};
        Assertions.assertThat(numbers).containsExactly(new String[]{"1", "2"});
    }

    @Test
    @DisplayName("(1,2)값이 주어졌을 때 String의 substring이 1,2를 반환하게 테스트")
    void ParseNumberUsingSubstring(){
        inputNumbersWithComma = "(1,2)";
        String substring = inputNumbersWithComma.substring(1, inputNumbersWithComma.length()-1);
        Assertions.assertThat(substring).isEqualTo("1,2");
    }

    @Test
    @DisplayName("abc값을 charAt()으로 가져올때 범위를 벗어나면 StringIndexOutOfBoundsException발생")
    void CharAtABC(){
        String abc = "ABC";
        Assertions.assertThatThrownBy(() -> abc.charAt(abc.length()))
                .isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range")
                .hasMessageContaining(String.valueOf(abc.length()));
    }

}
