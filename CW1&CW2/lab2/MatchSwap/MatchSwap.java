import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchSwap {

    /**
     * Modify a list of strings such that two strings with same
     * first letter are swapped.
     * For example, matchSwap(["ap", "bp", "cp", "aq", "cq", "bq"]) →
     * ["aq", "bq", "cq", "ap", "cp", "bp"].
     * @param list is a list of strings.
     * The strings are non-empty.
     * @return the modified list.
     */
    public static List<String> matchSwap(List<String> list) {
        Map<Character, Integer> swapCount = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            char firstLetter = list.get(i).charAt(0);
            if (swapCount.containsKey(firstLetter) == false)swapCount.put(firstLetter, i);
            else{
                int index = swapCount.get(firstLetter);
                String temp = list.get(i);
                list.set(i, list.get(index));
                list.set(index, temp);
                swapCount.remove(firstLetter);
            }
        }
		return list;
    }

}