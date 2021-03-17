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
}
