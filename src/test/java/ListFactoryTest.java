import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import utils.ListFactory;

import java.util.List;

class ListFactoryTest {

    @Test
    void shouldReturnArrayOf123WhenInputEqual3() {
        List<Integer> result = ListFactory.numberToList(3);
        List<Integer> expected = List.of(1, 2, 3);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shouldThrowExceptionWhenInputEqual0() {
        Executable executable = () -> ListFactory.numberToList(0);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, executable);
        Assertions.assertEquals("Number equal to 0", exception.getMessage());
    }

    @Test
    void shouldThrowExceptionWhenInputLessThan0() {
        Executable executable = () -> ListFactory.numberToList(-10);
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, executable);
        Assertions.assertEquals("Number less than 0", exception.getMessage());
    }
}
