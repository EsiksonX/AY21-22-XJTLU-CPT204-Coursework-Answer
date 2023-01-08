public class DelDuplicate {
	
    /**
     * Remove adjacent duplicate characters in a string.
     * For example, delDuplicate("aaabbc") → "abc".
     * @param input is the input string.
     * @return the resulting string.
     */
    public static String delDuplicate(String input) {
        return delDuplicateHelper(input, "");
    }

    public static String delDuplicateHelper(String input, String output) {
        // base case
        if (input.length() <= 0){
            return output;
        }
        // recursive step
        if (input.substring(1).indexOf(input.charAt(0)) != 0) {
            return delDuplicateHelper(input.substring(1), output.concat(String.valueOf(input.charAt(0))));
        }
        return delDuplicateHelper(input.substring(1), output);
    }
}
