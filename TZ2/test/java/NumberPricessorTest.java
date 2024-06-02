import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.IntStream;
import java.time.Duration;


public class NumberPricessorTest {
    @Test
    void test_min() {
        int[] numbers = {3, 5, 2, 8, 1};
        assertEquals(1, NumberProcessor._min(numbers));
    }

    @Test
    void test_max() {
        int[] numbers = {3, 5, 2, 8, 1};
        assertEquals(8, NumberProcessor._max(numbers));
    }

    @Test
    void test_sum() {
        int[] numbers = {3, 5, 2, 8, 1};
        assertEquals(19, NumberProcessor._sum(numbers));
    }

    @Test
    void test_mult() {
        int[] numbers = {3, 5, 2, 8, 1};
        assertEquals(240, NumberProcessor._mult(numbers));
    }