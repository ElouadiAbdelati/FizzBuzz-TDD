package utils;

import java.util.ArrayList;
import java.util.List;

public class ListFactory {
    public  static List<String> numberToList(int number){
        List<String> result = new ArrayList<>();
        for (int i = 1 ; i<= number ; i++) {
            result.add(String.valueOf(i));
        }
        return result;
    }
}
