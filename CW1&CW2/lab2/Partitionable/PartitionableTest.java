import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class PartitionableTest {

    @Test
    public void testPartitionable() {
        List<Integer> list = Arrays.asList(1, 1, 1, 2, 1);
        assertTrue(Partitionable.isPartitionable(list));

        List<Integer> list1 = Arrays.asList(0);
        assertTrue(Partitionable.isPartitionable(list1));
		// add more test cases
        List<Integer> list2 = Arrays.asList(-1, 1);
        assertTrue(Partitionable.isPartitionable(list2));
		
    }
	
    @Test
    public void testNotPartitionable() {
        List<Integer> list = Arrays.asList(2, 1, 1, 2, 1);        
        assertFalse(Partitionable.isPartitionable(list));

        List<Integer> list1 = Arrays.asList(-1, 0);
        assertFalse(Partitionable.isPartitionable(list1));


    }
	
	// add more test cases
    @Test
    public void testEmptyPartitionable() {
        List<Integer> list = Arrays.asList();
        assertTrue(Partitionable.isPartitionable(list));
    }
}