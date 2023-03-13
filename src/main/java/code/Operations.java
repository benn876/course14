package code;

import java.util.ArrayList;
import java.util.List;

public class Operations {
    public int sum(int a, int b) {
        return a + b;
    }

    public List<Integer> getEven(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        if (validateInput(list)) {
            for (Integer integer : list) {
                if (integer % 2 == 0) {
                    result.add(integer);
                }
            }
        }
        return result;
    }

    public boolean validateInput(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
