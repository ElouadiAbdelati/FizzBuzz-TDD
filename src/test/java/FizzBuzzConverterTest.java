import fizzbuzz.FizzBuzzConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzConverterTest {

    @Test
    void shouldReturn1WhenNumberEqual1() {
        String result = FizzBuzzConverter.convert(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    void shouldReturnFizzWhenNumberEqual3() {
        String result = FizzBuzzConverter.convert(3);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void shouldReturnFizzWhenNumberMultipleOf3() {
        String result = FizzBuzzConverter.convert(6);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void shouldReturnBuzzWhenNumberEqual5() {
        String result = FizzBuzzConverter.convert(5);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void shouldReturnBuzzWhenNumberMultipleOf5() {
        String result = FizzBuzzConverter.convert(20);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void shouldReturnFizzBuzzWhenNumberEqual15() {
        String result = FizzBuzzConverter.convert(15);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void shouldReturnFizzBuzzWhenNumberMultipleOf15() {
        String result = FizzBuzzConverter.convert(30);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void shouldReturnSameNumberWhenInputIsNotMultipleOf3And5And15() {
        String result = FizzBuzzConverter.convert(2);
        Assertions.assertEquals("2", result);
    }
}
