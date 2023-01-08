import org.junit.Test;
import static org.junit.Assert.*;

public class CountBabaMamaTest {

	@Test
	public void testCountBabaMama() {
		String input = "aba babaa amama ma";
		assertEquals(2, CountBabaMama.countBabaMama(input));

		String input2 = "bababamamama";
		assertEquals(4, CountBabaMama.countBabaMama(input2));
	}
	
}
