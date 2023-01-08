import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class HAMapTest {

    @Test
    public void testHAMap_1() {
        HAMap<String, Integer> map = new HAMap<>();
        assertFalse(map.containsKey("a"));
        map.put("a", 1);
        assertTrue(map.containsKey("a"));
        assertEquals(1, (int) map.get("a"));
        assertEquals(1, map.size());
        map.put("b", 2);
        map.put("c", 3);
        map.remove("a", 1);
        for (String key : map) {
            System.out.println("(" + key + ", " + map.get(key) + ")");
        }
        map.clear();
        assertEquals(0, map.size());
        assertFalse(map.containsKey("b"));
        assertFalse(map.containsKey("c"));

    }

    
	// add your own test cases below
	@Test
    public void testPut() {
        HAMap<Integer, String> map = new HAMap<>(32);
        assertEquals(0, map.size());
        assertNull(map.get(0));
        assertEquals(0, map.keySet().size());
        map.put(0, "a");
        assertEquals("a", map.get(0));
        assertEquals(1, map.size());
        assertEquals(32, map.getNumBuckets());
        assertEquals(1, map.keySet().size());
        map.put(0, "b");
        assertEquals("b", map.get(0));

    }

    @Test
    public void testHAMap_2() {
        HAMap<String, Integer> map = new HAMap<>(8, 0.75);
        map.put("a", 0);
        for (int i = 1; i <= 4; i++) {
            map.put("x" + i, i);
        }
        map.put("x" + 5, 5);
        map.put("x" + 6, 6);
        map.put("x" + 7, 7);
        map.put("a", 0);
        map.put("a", 1);
        map.put(new String("a"), 0);
        for (String key : map) {
            System.out.print("(" + key + "," + map.get(key) + ") ");
        }
        String a = "a";
        String b = new String("a");
        System.out.println(a.hashCode()==b.hashCode());
    }

	
	
	
}
