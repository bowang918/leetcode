public class Median {
    /**
     * @param nums: A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        // write your code here
        int length;
        if (nums == null || (length = nums.length) < 1) return -1;

        if (length == 1) return nums[0];

        int index = length >> 1;

        if (length % 2 == 0) {
            index--;
        }

        return quicksort(nums, 0, nums.length, index);


    }

    private int quicksort(int[] nums, int left, int right, int target) {
        if (left < right) {
            int pivot = partition(nums, left, right);

            if (pivot == target) {
                return nums[pivot];
            } else if (pivot < target) {
                return quicksort(nums, pivot + 1, right, target);
            } else {
                return quicksort(nums, left, pivot - 1, target);
            }

        }
        return nums[target];

    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        while (left < right) {
            while (left < right && pivot <= nums[right]) {
                right--;
            }
            nums[left] = nums[right];
            while (left < right && nums[left] < pivot) {
                left++;
            }
            nums[right] = nums[left];
        }

        nums[left] = pivot;

        return left;
    }
}
