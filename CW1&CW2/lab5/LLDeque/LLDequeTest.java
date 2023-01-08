import org.junit.Test;
import static org.junit.Assert.*;


public class LLDequeTest {

    @Test
    public void testEXERCISE() {
        LLDeque<String> deque = new LLDeque<>();
        assertTrue(deque.isEmpty());
        assertEquals(0, deque.size());
        deque.addFirst("b");
        deque.addFirst("a");
        assertEquals("a", deque.iterGet(0));
        assertEquals("b", deque.iterGet(1));

        assertEquals("a", deque.delFirst());
        assertEquals("b", deque.iterGet(0));
    }
	
	//	add more test cases
	
	
	

    @Test
    public void testASSIGNMENT() {
        LLDeque<String> deque = new LLDeque<>();
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        assertEquals("c", deque.recGet(2));
        assertEquals("a", deque.delFirst());
        assertEquals("c", deque.delLast());
        assertEquals("b", deque.recGet(0));
    }
	
	//	add more test cases
	@Test
    public void testAddLast() {
        LLDeque<String> deque = new LLDeque<>();
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        assertEquals("a", deque.iterGet(0));
        assertEquals("b", deque.iterGet(1));
        assertEquals("c", deque.iterGet(2));
    }
	
	
	@Test
    public void testDelFirst() {
        LLDeque<String> deque = new LLDeque<>();
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        assertEquals("a", deque.delFirst());
        assertEquals("b", deque.iterGet(0));
        assertEquals("c", deque.iterGet(1));
    }

    @Test
    public void testDelLast() {
        LLDeque<String> deque = new LLDeque<>();
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        assertEquals("c", deque.delLast());
        assertEquals("a", deque.iterGet(0));
        assertEquals("b", deque.iterGet(1));
    }

    @Test
    public void testaddFirstNotNull() {
        LLDeque<String> deque = new LLDeque<>();
        deque.addFirstNotNull("c");
        deque.addLegalFirst("b", "x");
        deque.addLegalFirst(null, "a");
        assertEquals("a", deque.iterGet(0));
        assertEquals("b", deque.iterGet(1));
        assertEquals("c", deque.iterGet(2));
    }
}
