public class CountBabaMama {

    /**
     * Count the number of occurrences of substrings "baba" or "mama"
     * in the input string recursively. They may overlap.
     * For example, countBabaMama("aba babaa amama ma") → 2,
     * and countBabaMama("bababamamama") → 4.
     * @param input is the input string.
     * @return the number of occurrences.
     */
    public static int countBabaMama(String input) {
		return countBabaMamaHelper(input, 0);
    }

    public static int countBabaMamaHelper(String input, int count) {
        if (input.length() < 4) {
            return count;
        }
        if (input.substring(0, 4).equals("mama") || input.substring(0, 4).equals("baba")) {
            return countBabaMamaHelper(input.substring(1), count + 1);
        }
        return countBabaMamaHelper(input.substring(1), count);
    }
}
