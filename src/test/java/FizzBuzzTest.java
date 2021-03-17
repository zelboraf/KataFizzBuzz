import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnZeroWhenZeroProvided() {
        String result = fizzBuzz.of(0);
        assertThat(result).isEqualTo("0");
    }

    @Test
    public void shouldReturnOneWhenOneProvided() {
        String result = fizzBuzz.of(1);
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void shouldReturnTwoWhenTwoProvided() {
        String result = fizzBuzz.of(2);
        assertThat(result).isEqualTo("2");
    }

    @Test
    public void shouldReturnFizzWhenThreeProvided() {
        String result = fizzBuzz.of(3);
        assertThat(result).isEqualTo("fizz");
    }

    @Test
    public void shouldReturnBuzzWhenFiveProvided() {
        String result = fizzBuzz.of(5);
        assertThat(result).isEqualTo("buzz");
    }

    @Test
    public void shouldReturnFizzWhenSixProvided() {
        String result = fizzBuzz.of(6);
        assertThat(result).isEqualTo("fizz");
    }

    @Test
    public void shouldReturnBuzzWhenTenProvided() {
        String result = fizzBuzz.of(10);
        assertThat(result).isEqualTo("buzz");
    }

    @Test
    public void shouldReturnFizzBuzzWhenFifteenProvided() {
        String result = fizzBuzz.of(15);
        assertThat(result).isEqualTo("fizzbuzz");
    }

    @Test
    public void shouldReturnFizzBuzzWhen45Provided() {
        String result = fizzBuzz.of(45);
        assertThat(result).isEqualTo("fizzbuzz");
    }
}
