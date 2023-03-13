import code.Operations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.util.List;

public class OperationsGetEvenMockTest {
    @Test
    public void testGetEven() {
        Operations operations = Mockito.mock(Operations.class);
        Mockito.when(operations.getEven(null)).thenCallRealMethod();
        Mockito.when(operations.validateInput(ArgumentMatchers.any())).thenReturn(true);

        Assertions.assertThrows(NullPointerException.class,()->operations.getEven(null));
    }
}
