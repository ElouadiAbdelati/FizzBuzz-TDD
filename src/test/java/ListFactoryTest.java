import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.ListFactory;

import java.util.List;

public class ListFactoryTest {
    
    @Test
    public void shouldReturnArrayOf123WhenInputEqual3(){
        List<String> result = ListFactory.numberToList(3);
        List<String> expected = List.of("1", "2", "3");
        Assertions.assertEquals(expected,result);
    }
}
