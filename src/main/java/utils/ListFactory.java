package utils;

import java.util.ArrayList;
import java.util.List;

public class ListFactory {
    public  static List<Integer> numberToList(int number){
        List<Integer> result = new ArrayList<>();
        for (int i = 1 ; i<= number ; i++) {
            result.add(i);
        }
        return result;
    }
}
