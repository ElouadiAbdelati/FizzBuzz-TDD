package fizzbuzz;

import utils.ListFactory;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzzEngine {

    private FizzBuzzEngine() {

    }

    public static List<String> fizzBuzz(int number) {
        return ListFactory.numberToList(number).stream().map(FizzBuzzConverter::convert).collect(Collectors.toList());
    }
}
