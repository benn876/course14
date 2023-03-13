import code.Operations;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OperationsGetEvenTest {
    @Test
    public void testGetEvenWhenTheListIsNull() {
        Operations operations = new Operations();

        List<Integer> result = operations.getEven(null);

        Assertions.assertThat(result).isEmpty();
    }

    @Test
    public void testGetEvenNoEvenNumbers() {
        Operations operations = new Operations();

        List<Integer> result = operations.getEven(List.of(1, 3, 5));

        Assertions.assertThat(result).isEmpty();
    }

    @Test
    public void testGetEvenWithEven() {
        Operations operations = new Operations();

        List<Integer> result = operations.getEven(List.of(1, 2, 5));

        Assertions.assertThat(result).containsExactlyInAnyOrder(2);
    }
}
