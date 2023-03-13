import code.TDD;
import code.ValidationException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create a function TDD.find that receives a list and a number and returns the index or -1 if not found
 */
public class TDDTest {
    @Test
    public void instantiateClass() {
        TDD tdd = new TDD();
    }

    @Test
    public void callMethod() {
        TDD tdd = new TDD();
        tdd.find(new ArrayList<>(), 4);
    }

    @Test
    public void methodReturnsAnInt() {
        TDD tdd = new TDD();
        Integer integer = tdd.find(new ArrayList<>(), 4);
    }

    @Test
    public void methodReturnMinusOneIfNotFound() {
        //GIVEN
        TDD tdd = new TDD();

        //WHEN
        Integer result = tdd.find(new ArrayList<>(), 4);

        //THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    void methodReturnsIndexIfFound() {
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> numbers = Arrays.asList(1, 4, 6);
        Integer element = 4;

        //WHEN
        Integer result = tdd.find(numbers, element);

        //THEN
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void throwsValidationExceptionIfTheListIsNull() {
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> numbers = null;
        Integer element = 4;

        //WHEN -> THEN
        org.junit.jupiter.api.Assertions.assertThrows(ValidationException.class, () -> tdd.find(numbers, element));
    }

    @Test
    void returnsMinusOneIfElementIsNull() {
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> numbers = Arrays.asList(1, 4, 5);
        Integer element = null;

        //WHEN
        Integer result = tdd.find(numbers, element);

        //THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

}
