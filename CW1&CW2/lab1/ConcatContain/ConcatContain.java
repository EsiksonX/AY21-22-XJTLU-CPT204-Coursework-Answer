public class ConcatContain {

    /**
     * Compute the smallest number of times source is concatenated with itself
     * so that the resulting string contains target.
     * For example, For example, source "ab" concatenated 2 times "ab"+"ab"+"ab" into "ababab"
     * contains target "baba".
     * @param source a non-empty string to be concatenated.
     * @param target a non-empty string that can be contained in repeatedly concatenated source.
     * @return the smallest number of times of the concatenation.
     */
    public static int concatContain(String source, String target) {
        int targetLength = target.length(), sourceLength = source.length();
        int sourceNum;
        if (targetLength % sourceLength == 0) sourceNum = targetLength / sourceLength;
        else sourceNum = targetLength / sourceLength + 1;
		String contain ="";
        for (int i = 0; i < sourceNum; i++) contain = contain.concat(source);
        if (contain.contains(target)) return sourceNum - 1;
        else{
            contain = contain.concat(source);
            if (contain.contains(target)) return sourceNum;
            else return -1;
        }
    }

    
}