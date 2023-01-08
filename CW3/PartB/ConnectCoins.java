public class ConnectCoins {

    private final UnionFind uf1;
    private final UnionFind uf2;  // optional
    private final boolean[][] ccMatrix;   // optional
    private final int row;        // optional
    private final int column;     // optional


    /*
     *****  DO NOT CHANGE ANY INSTANCE VARIABLES ABOVE *****
     *****  DO NOT ADD ANY INSTANCE VARIABLES **************
     *****  DO NOT ADD ANY LIBRARIES ******** **************
     *****  VIOLATION = 0 MARKS IN PART B ******************
     */

    /*
     ***** HELPER METHODS START *****
     */

    // Add your own helper methods here
    // INCLUDE your helper methods in your submission !

    private int index(int i, int j) {return i * column + j;}
    private int up(int i, int j) {return (i - 1) * column + j;}
    private int down(int i, int j) {return (i + 1) * column + j;}
    private int left(int i, int j) {return i * column + j - 1;}
    private int right(int i, int j) {return i * column + j + 1;}

    private boolean upLeft(int x,int y){
        if (y == 0) return false;
        try {return uf1.isSameGroup(up(x, y), left(x, y));} catch (Exception ignored){}
        return false;
    }

    private boolean upRight(int x,int y){
        if (y == column - 1) return false;
        try {return uf1.isSameGroup(up(x, y), right(x, y));} catch (Exception ignored){}
        return false;
    }

    private boolean leftRight(int x,int y){
        if (y == column - 1) return false;
        try {return uf1.isSameGroup(left(x, y), right(x, y));} catch (Exception ignored){}
        return false;
    }

    private boolean downRight(int x,int y){
        if (y == column - 1) return false;
        try {return uf1.isSameGroup(down(x, y), right(x, y));} catch (Exception ignored){}
        return false;
    }

    private boolean downUp(int x, int y){
        if (y == 0) return false;
        try {return uf1.isSameGroup(down(x, y), up(x, y));} catch (Exception ignored){}
        return false;
    }

    private boolean downLeft(int x,int y) {
        if (y == 0) return false;
        try {return uf1.isSameGroup(down(x, y), left(x, y));} catch (Exception ignored){}
        return false;
    }

    //加入左上，左下，又上，又下四个方向
    private int getConnCoin(int i, int j){
        int res = 1;
        if (j - 1 >= 0 && ccMatrix[i][j - 1]) {
            res += uf1.sizeOf(left(i, j));
        }
        if (i - 1 >= 0 && ccMatrix[i - 1][j]) {
            if (!upLeft(i, j)) {
                res += uf1.sizeOf(up(i, j));
            }
        }
        if (j + 1 < column && ccMatrix[i][j + 1]) {
            if (!upRight(i, j) && !leftRight(i, j)) {
                res += uf1.sizeOf(right(i, j));
            }
        }
        if (i + 1 < row && ccMatrix[i + 1][j]) {
            if (!downUp(i, j) && !downRight(i, j) && !downLeft(i, j)) {
                res += uf1.sizeOf(down(i, j));
            }
        }
        return res;
    }
    /*
     ***** HELPER METHODS END *****
     */


    // COURSEWORK 3 PART B.1 Connect Coin CONSTRUCTOR

    /**
     * Initializes the instance variable including a UnionFind data structure.
     * @param ccMatrix is s a 2-D boolean array of true (T) and false (F) values
     *                 to represent the 2-D space where A T in a coordinate indicates that there is a coin
     *                 at that position in the 2-D space, while an F indicates an empty space
     */
    public ConnectCoins(boolean[][] ccMatrix) {
        this.ccMatrix = ccMatrix;
        row = ccMatrix.length;
        column = ccMatrix[0].length;
        uf1 = new UnionFind(row * column);
        uf2 = null;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                if (ccMatrix[i][j]){
                    if (i + 1 < row) if (ccMatrix[i + 1][j]) uf1.union(index(i, j), down(i, j));
                    if (j + 1 < column) if (ccMatrix[i][j + 1]) uf1.union(index(i, j), right(i, j));
                }
            }
        }
    }

    // COURSEWORK 3 PART B.2 Connect Coins PLACE MAX CONNECTED COINS

    /**
     * @return a 2-element integer array that represents the coordinate in [row, column],
     * so that a coin that is placed in that coordinate will give the maximum number of newly connected coins.
     * If there are multiple possible such placements, return the left-and-topmost coordinate.
     */

    public int[] placeMaxConnCoins() {
        int[] res = new int[2];
        int maxCoin = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int temp;
                if (!ccMatrix[i][j]){
                    temp = getConnCoin(i, j);
                    if (temp > maxCoin) {
                        maxCoin = temp;
                        res[0] = i;
                        res[1] = j;
                    }
                }
            }
        }
        return res;
    }



    // COURSEWORK 3 PART B.3 Connect Coins MAX CONNECTED COINS

    /**
     * @return the maximum number of newly connected coins after placing a new coin.
     */
    public int maxConnCoins() {
        int[] maxCoinPoint = placeMaxConnCoins();
        return getConnCoin(maxCoinPoint[0], maxCoinPoint[1]);
    }
}
