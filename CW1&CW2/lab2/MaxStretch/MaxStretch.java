import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxStretch {

    /**
     * Find the largest stretch in a list.
     * For example, maxStretch([8, 5, 1, 2, 3, 4, 5, 10]) = 6.
     * @param list is a list of integers.
     * @return the largest stretch in list.
     */
    public static int maxStretch(List<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int index = list.lastIndexOf(list.get(i));
            int temp = index - i + 1;
            if (temp > max) max = temp;
        }
        return  max;
    }
}