import org.junit.Test;
import static org.junit.Assert.*;

public class WeightedQuickUnionTest {

    @Test
    public void testWeightedQUDS_1() {
        WeightedQuickUnion uf = new WeightedQuickUnion(4);
        uf.union(1, 0);
        assertEquals(true, uf.isSameGroup(1, 0));
        assertEquals(0, uf.parent(1));
        assertEquals(-2, uf.parent(0));
        uf.union(3, 2);
        assertEquals(false, uf.isSameGroup(2, 1));
        uf.union(3, 1);
        assertEquals(true, uf.isSameGroup(2, 1));
        assertEquals(0, uf.parent(2));
        assertEquals(4, uf.sizeOf(1));
    }

    @Test
    public void test2(){
        WeightedQuickUnion uf = new WeightedQuickUnion(19);
        assertEquals(1, uf.sizeOf(16));
        assertEquals(false, uf.isSameGroup(16, 0));
        for(int i=1; i<=15; i+=2) {
            uf.union(i+1, i);
        }
        assertEquals(false, uf.isSameGroup(0, 16));
        assertEquals(true, uf.isSameGroup(15, 16));
        assertEquals(1, uf.sizeOf(0));
        assertEquals(2, uf.sizeOf(15));
        assertEquals(2, uf.sizeOf(16));
        for(int i=1; i<=15; i+=2) {
            uf.union(i+1, i);
        }
        uf.union(1, 3);
        uf.union(5, 8);
        uf.union(10, 11);
        uf.union(14, 16);
        assertEquals(4, uf.sizeOf(6));
        assertEquals(4, uf.sizeOf(13));
        assertEquals(false, uf.isSameGroup(1, 8));
        assertEquals(false, uf.isSameGroup(11, 15));
        uf.union(2, 5);
        uf.union(14, 10);
        assertEquals(true, uf.isSameGroup(1, 8));
        assertEquals(true, uf.isSameGroup(11, 15));
        assertEquals(8, uf.sizeOf(2));
        assertEquals(8, uf.sizeOf(10));
        assertEquals(8, uf.sizeOf(7));
        assertEquals(8, uf.sizeOf(3));
        uf.union(8, 7);
        uf.union(14, 12);
        assertEquals(false, uf.isSameGroup(1, 13));
        uf.union(14, 2);
        assertEquals(true, uf.isSameGroup(13, 1));
        assertEquals(16, uf.sizeOf(14));
        assertEquals(16, uf.sizeOf(2));
        uf.union(0, 14);
        assertEquals(17, uf.sizeOf(0));
        uf.union(17, 18);
        uf.union(16, 17);
        assertEquals(19, uf.sizeOf(17));
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateTest_1() {
        WeightedQuickUnion uf = new WeightedQuickUnion(5);
        uf.validate(10);
    }
	
	
	// add your own Unit Tests and Integration Tests here
	
//    @Test
//    public void testSizeOf(){
//
//    }
	
	
}
