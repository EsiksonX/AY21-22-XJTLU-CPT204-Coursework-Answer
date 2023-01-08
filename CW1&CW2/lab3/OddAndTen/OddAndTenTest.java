import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class OddAndTenTest {

    @Test
    public void OddAndTenTrue() {
        List<Integer> list1 = Arrays.asList(5, 5, 3);
        assertTrue(OddAndTen.oddAndTen(list1));

        List<Integer> list2 = Arrays.asList(5, 5, 4, 1);
        assertTrue(OddAndTen.oddAndTen(list2));
    }

    @Test
    public void OddAndTenFalse() {
        List<Integer> list1 = Arrays.asList(5, 5, 4);
        assertFalse(OddAndTen.oddAndTen(list1));
    }
}
