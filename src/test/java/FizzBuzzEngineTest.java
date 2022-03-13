import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzEngineTest {

    @Test
    void shouldThrowExceptionWhenInputEqual0() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzEngine.fizzBuzz(0));
    }

}