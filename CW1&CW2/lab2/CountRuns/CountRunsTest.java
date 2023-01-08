import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountRunsTest {
	
	// add test cases
	@Test
	public void testSingleCount() {
		List<Integer> list = Arrays.asList(2, 2, 2, 2);
		assertEquals(1, CountRuns.countRuns(list));
	}
	@Test
	public void testDoubleCount() {
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 5);
		assertEquals(2, CountRuns.countRuns(list));
	}
	@Test
	public void testNoCount() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		assertEquals(0, CountRuns.countRuns(list));
	}
	@Test
	public void testEmptyCount() {
		List<Integer> list = Arrays.asList();
		assertEquals(0, CountRuns.countRuns(list));
	}
}