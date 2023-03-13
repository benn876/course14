import code.Operations;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class OperationsTest {
    private Operations operations;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Welcome to the testing area");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("beforeEach");
        this.operations = new Operations();
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("afterEach");
    }

    @Test
    @DisplayName("WHEN sum is called on two positive numbers THEN correct sum is returned")
    public void sumTest() {
        System.out.println("sumTest");
        // GIVEN
        int par1 = 4;
        int par2 = 3;

        //WHEN
        int result = operations.sum(par1, par2);

        //THEN
        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    @DisplayName("WHEN sum is called on two negative numbers THEN correct sum is returned")
    public void sumNegativeNumbersTest() {
        System.out.println("sumNegativeNumbersTest");
        //GIVEN
        int par1 = -1;
        int par2 = -4;

        //WHEN
        int result = operations.sum(par1, par2);

        //THEN
        Assertions.assertThat(result).isEqualTo(-5);
    }

}
