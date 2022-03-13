import fizzbuzz.FizzBuzzEngine;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzEngineTest {

    @Test
    void shouldThrowExceptionWhenInputEqual0() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzEngine.fizzBuzz(0));
    }

    @Test
    void shouldReturnListOf1And2AndFizzWhenInput3() {
        assertEquals(List.of("1", "2", "Fizz"), FizzBuzzEngine.fizzBuzz(3));
    }


    @Test
    void shouldReturnListOf1And2AndFizzAnd4AndBuzzAndFizzWhenInput6() {
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz","Fizz"), FizzBuzzEngine.fizzBuzz(6));
    }
}