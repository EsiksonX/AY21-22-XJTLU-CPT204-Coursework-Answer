import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ConnectCoinsTestC {

    @Test
    public void givenTestCase() {
        boolean[][] ccMatrix = {{true,  false, true,  true},
                                {true,  false, true,  false},
                                {true,  false, true,  false},
                                {false, true,  false, true},
                                {false, true,  false, true},
                                {true,  false, false, true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 10;
        assertEquals(scores, cc.maxConnCoins());
        System.out.print("1   "+cc.maxConnCoins());
        System.out.println(Arrays.toString(cc.placeMaxConnCoins()));
    }

    @Test
    public void givenTestCase2() {
        boolean[][] ccMatrix = {{false, true, true, true, false},
                {true, false, false, false, true},
                {true, false, false, false, true},
                {false, true, true, true, false}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 6;
        assertEquals(scores, cc.maxConnCoins());
        System.out.print("2   "+cc.maxConnCoins());
        System.out.println(Arrays.toString(cc.placeMaxConnCoins()));
    }
        @Test
        public void givenTestCase3() {
            boolean[][] ccMatrix = {{true,false}};
            ConnectCoins cc = new ConnectCoins(ccMatrix);
            int scores = 2;
            assertEquals(scores, cc.maxConnCoins());
            System.out.print("3   "+cc.maxConnCoins());
            System.out.println(Arrays.toString(cc.placeMaxConnCoins()));
    }

    @Test
    public void givenTestCase4() {
        boolean[][] ccMatrix = {{false},
                {false},
                {false},
                {true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 2;
        assertEquals(scores, cc.maxConnCoins());
        System.out.print("4   "+cc.maxConnCoins());
        System.out.println(Arrays.toString(cc.placeMaxConnCoins()));
    }

    @Test
    public void givenTestCase5() {
        boolean[][] ccMatrix = {{true,false,false},
                {false,false,false},
                {true,false,false}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int[] ans = {1,0};
        assertArrayEquals(ans,index);
        int scores = 3;
        assertEquals(scores, cc.maxConnCoins());
        System.out.print("5   "+cc.maxConnCoins());
        System.out.println(Arrays.toString(cc.placeMaxConnCoins()));
    }

    @Test
    public void givenTestCase6() {
        boolean[][] ccMatrix = {{false,true,false},
                {false,false,false},
                {true,false,false}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 2;
        assertEquals(scores, cc.maxConnCoins());
        System.out.print("6   "+cc.maxConnCoins());
        System.out.println(Arrays.toString(cc.placeMaxConnCoins()));
    }

    @Test
    public void givenTestCase7() {
        boolean[][] ccMatrix = {{false,false,true},
                {false,false,false},
                {true,false,false}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 2;
        assertEquals(scores, cc.maxConnCoins());
        System.out.print("7   "+cc.maxConnCoins());
        System.out.println(Arrays.toString(cc.placeMaxConnCoins()));
    }

    @Test
    public void givenTestCase8() {
        boolean[][] ccMatrix = {{false,false,false},
                {false,false,false},
                {true,false,false}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 2;
        assertEquals(scores, cc.maxConnCoins());
        System.out.print("8   "+cc.maxConnCoins());
        System.out.println(Arrays.toString(cc.placeMaxConnCoins()));
    }

    @Test
    public void givenTestCase9() {
        boolean[][] ccMatrix = {{false,false,false},
                {false,false,false},
                {false,true,false}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 2;
        assertEquals(scores, cc.maxConnCoins());
        System.out.print("9   "+cc.maxConnCoins());
        System.out.println(Arrays.toString(cc.placeMaxConnCoins()));
    }

    @Test
    public void givenTestCase10() {
        boolean[][] ccMatrix = {{false,false,false},
                {false,false,false},
                {false,false,true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 2;
        assertEquals(scores, cc.maxConnCoins());
        System.out.print("10   "+cc.maxConnCoins());
        System.out.println(Arrays.toString(cc.placeMaxConnCoins()));
    }

    @Test
    public void givenTestCase11() {
        boolean[][] ccMatrix = {{true,false,true},
                {false,false,false},
                {true,false,true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 3;
        assertEquals(scores, cc.maxConnCoins());
        System.out.print("11   "+cc.maxConnCoins());
        System.out.println(Arrays.toString(cc.placeMaxConnCoins()));
    }
}
