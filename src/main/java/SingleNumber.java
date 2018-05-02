import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    /**
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        int length;
        if (A == null || (length = A.length) < 1) return -1;

        if (length == 1) return A[0];

        Map<Integer, Integer> counts = new HashMap<>(length);

        for (int i : A) {
            Integer count = counts.get(i);

            if (count == null) {
                count = 1;
            } else {
                count++;
            }

            counts.put(i, count);
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }

        return -1;
    }
}
