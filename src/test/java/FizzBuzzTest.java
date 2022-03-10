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
}
