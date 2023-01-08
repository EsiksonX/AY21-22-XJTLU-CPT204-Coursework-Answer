import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountRuns {

    /**
     * Count the number of runs in a list.
     * For example, countRuns([1, 2, 2, 2, 3]) = 1.
     * @param list is a list of integers.
     * @return the number of runs in list.
     */
    public static int countRuns(List<Integer> list) {
        int runs = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == list.get(i + 1) && list.get(i) != 0) {
                runs++;
                int j = i + 1;
                while (j < list.size()) {
                    if (list.get(i) == list.get(j)) list.set(j, 0);
                    else break;
                    j++;

                }
            }
        }
        return runs;
    }
}