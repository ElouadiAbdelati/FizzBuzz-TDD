import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public  void  shouldReturn1WhenNumberEqual1(){
        String result = FizzBuzzConverter.convert(1);
        Assertions.assertEquals("1",result);
    }

}
