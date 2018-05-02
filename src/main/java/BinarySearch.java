public class BinarySearch {
    /**
     * @param nums:   The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        if (nums == null || nums.length < 1) return -1;

        return search(nums, target, 0, nums.length);

    }

    private int search(int[] nums, int target, int start, int end) {

        int middle = (start + end) >> 1;

        if (nums[middle] == target) {
            while (middle > 1 && nums[middle - 1] == target) {
                middle--;
            }
            return middle;
        }
        if (middle == start) return -1;

        if (target <= nums[middle])
            return search(nums, target, start, middle);
        else
            return search(nums, target, middle, end);
    }
}
