public class KthLargestElement {
    /*
     * @param k : description of k
     * @param nums : array of nums
     * @return: description of return
     */
    public int kthLargestElement(int k, int[] nums) {
        // write your code here
        return solution(k, nums);
    }

    private int solution(int k, int[] nums) {
        if (k < 1 || nums == null || nums.length < 1) throw new IllegalArgumentException("");

        return quickSort(nums, 0, nums.length - 1, k);

    }

    private int quickSort(int[] nums, int left, int right, int k) {
        int i = left, j = right, pivot = nums[i];
        while (i < j) {
            while (i < j && pivot <= nums[j]) {
                j--;
            }
            nums[i] = nums[j];

            while (i < j && nums[i] < pivot) {
                i++;
            }
            nums[j] = nums[i];
        }
        nums[i] = pivot;

        int index =  nums.length - k;

        if (i == index) {
            return pivot;
        } else if (i > index) {
            return quickSort(nums, left, i-1, k);
        }
        return quickSort(nums, i + 1, right, k);
    }
}
