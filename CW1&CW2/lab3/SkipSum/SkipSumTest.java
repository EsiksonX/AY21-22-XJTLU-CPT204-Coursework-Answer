import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class SkipSumTest {

    @Test
    public void SkipSumTestTrue() {
        List<Integer> list1 = Arrays.asList(2, 5, 10);
        assertTrue(SkipSum.skipSum(list1, 12));

        assertTrue(SkipSum.skipSum(list1, 0));
    }

    @Test
    public void SkipSumTestFalse() {
        List<Integer> list1 = Arrays.asList(2, 5, 10);
        assertFalse(SkipSum.skipSum(list1, 7));
    }
}
