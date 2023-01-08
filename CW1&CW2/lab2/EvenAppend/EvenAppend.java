import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class EvenAppend {

    /**
     * Append words that appear the 2nd, 4th, 6th, etc. time in a list.
     * For example, evenAppend(["a", "b", "b", "a", "a", "b", "b"]) → "bab".
     * @param list is a list of words.
     * @return a concatenation of even appearing words.
     */
    public static String evenAppend(List<String> list) {
        String result = "";
        Map<String, Integer> elements = new HashMap<String, Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (elements.containsKey(list.get(i)) == false) elements.put(list.get(i), 1);
            else if (elements.containsKey(list.get(i)) == true && elements.get(list.get(i)) == 1){
                result = result + list.get(i);
                elements.put(list.get(i), 2);
            } else {
                elements.put(list.get(i), 1);
            }
        }
		return result;
    }

}