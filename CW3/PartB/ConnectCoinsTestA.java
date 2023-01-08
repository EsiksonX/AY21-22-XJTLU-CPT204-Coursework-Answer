import org.junit.Test;
import static org.junit.Assert.*;

public class ConnectCoinsTestA {

    @Test
    public void givenTestCase() {
        boolean[][] ccMatrix = {{true,  false, true,  true},
                                {true,  false, true,  false},
                                {true,  false, true,  false},
                                {false, true,  false, true},
                                {false, true,  false, true},
                                {true,  false, false, true}};
        //boolean[][] ccMatrix = null;
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 10;
        int[] x = new int[2];
        x[0] = 2;
        x[1] = 1;
        assertArrayEquals(x, cc.placeMaxConnCoins());
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void testCase0() {
        boolean[][] ccMatrix = {{true,  false},
                {false, true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 3;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase1() {
        boolean[][] ccMatrix = {{false,  false, false,  false},
                {false,  false, false,  false},
                {false,  false, false,  false},
                {false,  false, false,  false},
                {false,  false, false,  false},
                {false,  false, false,  false}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 1;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase2() {
        boolean[][] ccMatrix = {{false, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 24;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase3() {
        boolean[][] ccMatrix = {{true,true,true,false},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 24;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase4() {
        boolean[][] ccMatrix = {{true,true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {false,true,true,true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 24;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase5() {
        boolean[][] ccMatrix = {{true,true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true,true,true,false}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 24;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase6() {
        boolean[][] ccMatrix = {{true,true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, false,true,true},
                {true, true,true,true},
                {true,true,true,true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 24;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase7() {
        boolean[][] ccMatrix = {{false, true,true,true},
                {true, false,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 23;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase8() {
        boolean[][] ccMatrix = {{false, false,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 23;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase9() {
        boolean[][] ccMatrix = {{false,true,true,true},
                {false, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true},
                {true, true,true,true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 23;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase10() {
        boolean[][] ccMatrix = {{false}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 1;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase11() {
        boolean[][] ccMatrix = new boolean[1000][1000];
        for(int i=0;i<1000;i++){
            for(int j=0;j<1000;j++){
                ccMatrix[i][j] = true;
            }
        }
        ccMatrix[1][100] = false;
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 1000000;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase12() {
        boolean[][] ccMatrix = new boolean[1000][1000];
        for(int i=0;i<1000;i++){
            for(int j=0;j<1000;j++){
                ccMatrix[i][j] = true;
            }
        }
        ccMatrix[0][100] = false;
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 1000000;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase13() {
        boolean[][] ccMatrix = new boolean[1000][1000];
        for(int i=0;i<1000;i++){
            for(int j=0;j<1000;j++){
                ccMatrix[i][j] = true;
            }
        }
        ccMatrix[999][100] = false;
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 1000000;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase14() {
        boolean[][] ccMatrix = new boolean[1000][1000];
        for(int i=0;i<1000;i++){
            for(int j=0;j<1000;j++){
                ccMatrix[i][j] = true;
            }
        }
        ccMatrix[999][0] = false;
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 1000000;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase15() {
        boolean[][] ccMatrix = new boolean[1000][1000];
        for(int i=0;i<1000;i++){
            for(int j=0;j<1000;j++){
                ccMatrix[i][j] = true;
            }
        }
        ccMatrix[999][999] = false;
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 1000000;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase16() {
        boolean[][] ccMatrix = new boolean[1000][1];
        for(int i=0;i<1000;i++){
            for(int j=0;j<1;j++){
                ccMatrix[i][j] = true;
            }
        }
        ccMatrix[900][0] = false;
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 1000;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase17() {
        boolean[][] ccMatrix = new boolean[1000][1];
        for(int i=0;i<1000;i++){
            for(int j=0;j<1;j++){
                ccMatrix[i][j] = true;
            }
        }
        ccMatrix[899][0] = false;
        ccMatrix[900][0] = false;
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int[] index = cc.placeMaxConnCoins();
        System.out.println(index[0]+" "+index[1]);
        int scores = 900;
        assertEquals(scores, cc.maxConnCoins());
    }

    @Test
    public void TestCase18() {
        boolean[][] ccMatrix = {{true,  true,  true},
                {true,  false, true},
                {true,  false, true},
                {false,  true,  false},};

        //boolean[][] ccMatrix = null;
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 9;
        int[] x = new int[2];
        x[0] = 2;
        x[1] = 1;
        assertEquals(scores, cc.maxConnCoins());
        assertArrayEquals(x, cc.placeMaxConnCoins());
    }

    @Test
    public void TestCase19() {
        boolean[][] ccMatrix = {{true,  true, true,  true},
                {true,  false, false,  true},
                {true,  false, false,  true},
                {true, false,  false, true},
                {true,  true, true, true}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 15;
        int[] x = new int[2];
        x[0] = 1;
        x[1] = 1;
        assertEquals(scores, cc.maxConnCoins());
        assertArrayEquals(x, cc.placeMaxConnCoins());
    }

    @Test
    public void TestCase20() {
        boolean[][] ccMatrix = {{true,  true,  true,  true,},
                {true,  false, false,  false},
                {true,  true,  true,  true,}};
        ConnectCoins cc = new ConnectCoins(ccMatrix);
        int scores = 10;
        int[] x = new int[2];
        x[0] = 1;
        x[1] = 1;
        assertEquals(scores, cc.maxConnCoins());
        assertArrayEquals(x, cc.placeMaxConnCoins());
    }
}
