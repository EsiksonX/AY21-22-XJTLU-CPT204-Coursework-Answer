import java.util.List;

public class Partitionable {

    /**
     * Decide whether a list is partitionable.
     * For example, isPartitionable([1, 1, 1, 2, 1]) -> true,
     * and isPartitionable([2, 1, 1, 2, 1]) -> false.
     * @param list is a non-empty list of integers.
     * @return true iff list is partitionable.
     */
    public static boolean isPartitionable(List<Integer> list) {
        boolean result = false;
        int num = 0, sum = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int left = 0, right = 0;
            for (int j = i; j >= 0; j--){
                left = left + list.get(j);
            }
            for (int j = i + 1; j < list.size(); j++) {
                right = right + list.get(j);
            }
            if (left == right) {
                result = true;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        if (sum == 0) result = true;
        return result;
    }
}