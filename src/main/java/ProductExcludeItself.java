import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductExcludeItself {
    /*
   * @param nums: Given an integers array A
   * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
   */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        int length;
        if (nums == null || (length = nums.size()) < 1) return new ArrayList<>(0);

        long[] result = new long[length];
        if (length < 2) {
            result[0] = 1L;
        } else {
            long temp = 1;

            int[] data = nums.stream().mapToInt(Integer::intValue).toArray();
            for (int i = 0; i < length; i++) {
                result[i] = temp;
                temp *= data[i];
            }

            temp = 1;
            for (int i = length - 1; i >= 0; i--) {
                result[i] *= temp;
                temp *= data[i];
            }
        }
        return Arrays.stream(result).boxed().collect(Collectors.toList());
    }

    public int balanceNumber(int[] nums) {
        int length;
        if (nums == null || (length = nums.length) < 1) return -1;

        if (length == 1) return nums[0];

        int[] sums = new int[length];
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sums[i] = sum;
            sum += nums[i];
        }

        sum = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (sum == sums[i]) return i;
            sum += nums[i];
        }

        return -1;
    }
}
