import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnZeroWhenZeroProvided() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.of(0);
        Assertions.assertThat(result).isEqualTo("0");
    }
}
