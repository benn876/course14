package code;

import java.util.List;

public class TDD {
    public Integer find(List<Integer> numbers, Integer find) {
        if(numbers == null){
            throw new ValidationException();
        }
        return numbers.indexOf(find);
    }

    //isTrue(true)
    //isTrue(false)
    public boolean isTrue(boolean test1){
        return test1;
    }


    //isTrue(true,true)
    //isTrue(true,false)
    //isTrue(false,true)
    //isTrue(false,false)
    public boolean isTrue(boolean test1, boolean test2){
        return test1 && test2;
    }
}
