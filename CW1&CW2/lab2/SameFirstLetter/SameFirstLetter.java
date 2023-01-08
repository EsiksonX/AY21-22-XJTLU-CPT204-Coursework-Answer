import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SameFirstLetter {

    /**
     * Create a map with first letter as key and words with that same
     * first letter separated by comma.
     * For example, numWords(["alice", "bob", "apple", "banana"]) →
     * {"a": "alice,apple", "b": "bob,banana"}.
     * @param list is a list of strings.
     * The strings are non-empty.
     * @return a map with first letter and comma-separated-words pair.
     */
    public static Map<String, String> sameFirstLetter(List<String> list) {
        Map<String, String> result = new HashMap<String, String>();
		for (int i = 0; i < list.size(); i++) {
            String firstLetter = String.valueOf(list.get(i).charAt(0));
            if (result.containsKey(firstLetter) == false) result.put(firstLetter, list.get(i));
            else {
                result.put(firstLetter, result.get(firstLetter).concat(",").concat(list.get(i)));
            }
        }
		return result;
    }
}