import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityNumber {
    /*
    * @param nums: a list of integers
    * @return: find a  majority number
    */
    public int majorityNumber(List<Integer> nums) {
        // write your code here
        int length;
        if (nums == null || (length = nums.size()) < 1) return -1;

        if (length < 2) return nums.get(0);

        Map<Integer, Integer> counts = new HashMap<>(length);
        int max = 0;

        for (int i : nums) {
            Integer count = counts.get(i);

            if (count == null) {
                count = 1;
            } else {
                count++;
            }

            max = Math.max(max, count);

            if (max > (length >> 1)) {
                return i;
            }
            counts.put(i, count);
        }
        return -1;
    }
}
