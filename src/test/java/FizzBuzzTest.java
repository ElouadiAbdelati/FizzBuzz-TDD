import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public  void  shouldReturn1WhenNumberEqual1(){
        String result = FizzBuzzConverter.convert(1);
        Assertions.assertEquals("1",result);
    }

    @Test
    public  void  shouldReturnFizzWhenNumberEqual3(){
        String result = FizzBuzzConverter.convert(3);
        Assertions.assertEquals("Fizz",result);
    }

    @Test
    public  void  shouldReturnFizzWhenNumberMultipleOf3(){
        String result = FizzBuzzConverter.convert(6);
        Assertions.assertEquals("Fizz",result);
    }

    @Test
    public  void  shouldReturnBuzzWhenNumberEqual5(){
        String result = FizzBuzzConverter.convert(5);
        Assertions.assertEquals("Buzz",result);
    }
    @Test
    public  void  shouldReturnBuzzWhenNumberMultipleOf5(){
        String result = FizzBuzzConverter.convert(20);
        Assertions.assertEquals("Buzz",result);
    }
    @Test
    public  void  shouldReturnFizzBuzzWhenNumberEqual15(){
        String result = FizzBuzzConverter.convert(15);
        Assertions.assertEquals("FizzBuzz",result);
    }
}
