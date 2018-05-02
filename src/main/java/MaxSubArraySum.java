import java.util.List;

public class MaxSubArraySum {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        // write your code here
        return solution1(nums);
    }

    private int solution1(int[] nums) {
        int length;
        if (nums == null || (length = nums.length) < 1) return -1;

        if (length == 1) return nums[0];

        int[] sums = new int[length];
        sums[0] = nums[0];

        int max = sums[0];
        for (int i = 1; i < length; i++) {
            int cur = nums[i];

            sums[i] = Math.max(cur + sums[i - 1], cur);
            max = Math.max(max, sums[i]);
        }
        return max;
    }

    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public int minSubArray(List<Integer> nums) {
        // write your code here
        int length;
        if (nums == null || (length = nums.size()) < 1) return -1;

        if (length == 1) return nums.get(0);

        int[] sums = new int[length];
        sums[0] = nums.get(0);

        int min = sums[0];
        for (int i = 1; i < length; i++) {
            int cur = nums.get(i);

            sums[i] = Math.min(cur + sums[i - 1], cur);
            min = Math.min(min, sums[i]);
        }
        return min;
    }

    /**
     * @param nums: an array of integers
     * @param k1:   An integer
     * @param k2:   An integer
     * @return: the largest sum
     */
    public int maxSubarray5(int[] nums, int k1, int k2) {
        // write your code here
        int length;
        if (nums == null || (length = nums.length) < 1 || k1 > k2 || k1 > length) return -1;

        if (length == 1) return nums[0];

        int[] sums = new int[length], lengths = new int[length];

        sums[0] = nums[0];
        lengths[0] = 1;

        int max = sums[0];
        for (int i = 1; i < length; i++) {
            int cur = nums[i], temp = cur + sums[i - 1];


            if (temp > cur && k1 <= lengths[i - 1] + 1 && lengths[i - 1] + 1 <= k2) {
                lengths[i] = lengths[i - 1] + 1;
                sums[i] = temp;
            } else if (temp < cur) {
                lengths[i] = 1;
                sums[i] = cur;
            } else {

            }

            max = Math.max(max, sums[i]);
        }
        return max;
    }
}
