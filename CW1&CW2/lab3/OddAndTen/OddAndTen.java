import java.util.List;

public class OddAndTen {
    /**
     * Decide if it is possible to divide the integers in a list into two sets,
     * so that the sum of one set is odd, and the sum of the other set is a multiple of 10.
     * Every integer must be in one set or the other.
     * For example, oddAndTen([5, 5, 3])  →  true,
     * and oddAndTen([5, 5, 4])  →  false.
     * @param list is a list of integers.
     * @return true iff there is one odd partition and the other multiple of 10.
     */
    public static boolean oddAndTen(List<Integer> list) {
        // call your recursive helper method
        return oddAndTenHelper(list,0,0,0);
    }

    private static boolean oddAndTenHelper(List<Integer> list, int odd, int ten, int start) { // add any parameters
        // base case
        if (start >= list.size()) {
            return ten % 10 == 0 && odd % 2 == 1;
        }
        // recursive step
        return oddAndTenHelper(list, odd + list.get(start), ten, start + 1)
                ||
                oddAndTenHelper(list, odd, ten + list.get(start), start + 1);
    }
}
