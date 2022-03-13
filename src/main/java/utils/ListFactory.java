package utils;

import java.util.ArrayList;
import java.util.List;

public class ListFactory {
    private ListFactory() {

    }

    public static List<Integer> numberToList(int number) {
        if (number < 0) throw new IllegalArgumentException("Number less than 0");
        if (number == 0) throw new IllegalArgumentException("Number equal to 0");
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            result.add(i);
        }
        return result;
    }
}
