import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;


public class MatchSwapTest {

    @Test
    public void testMatchSwap() {
        List<String> list = Arrays.asList("apple", "avocado");
        List<String> expect = Arrays.asList("avocado", "apple");
        assertEquals(expect, MatchSwap.matchSwap(list));

        List<String> list1 = Arrays.asList("ab", "ac", "ad", "ae", "af");
        List<String> expect1 = Arrays.asList("ac", "ab", "ae", "ad", "af");
        assertEquals(expect1, MatchSwap.matchSwap(list1));


        List<String> list2 = Arrays.asList("ap", "bp", "cp", "aq", "cq", "bq");
        List<String> expect2 = Arrays.asList("aq", "bq", "cq", "ap", "cp", "bp");
        assertEquals(expect2, MatchSwap.matchSwap(list2));
    }
	
	
	
}