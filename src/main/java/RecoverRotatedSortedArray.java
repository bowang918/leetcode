import java.util.List;
import java.util.Objects;

public class RecoverRotatedSortedArray {

    /**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here

    }

    private void solution1(List<Integer> nums) {
        int length;
        if (nums == null || (length = nums.size()) < 2) return;

        int[] source = nums.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).toArray();

        if ((length = source.length) < 2 || source[0] <= source[length - 1]) return;

        int offset;
        for (offset = 1; offset < source.length; offset++) {
            if (source[offset] < source[offset - 1]) {
                break;
            }
        }

        int index = 0;
        for (; index < (length - offset); index++) {
            nums.set(index, source[index + offset]);
        }

        for (; index < length; index++) {
            nums.set(index, source[index + offset - length]);
        }
    }

    private void solution2(List<Integer> nums) {
        int length;
        if (nums == null || (length = nums.size()) < 2) return;

        nums.sort(Integer::compareTo);
    }

    private void solution3(List<Integer> nums) {
        int length;
        if (nums == null || (length = nums.size()) < 2) return;

        int offset = 1;
        while (offset < length && nums.get(offset) >= nums.get(offset - 1)) {
            offset++;
        }

        if (offset == length) return;

        rotate(nums, 0, offset);
        rotate(nums, offset, length);
        rotate(nums, 0, length);
    }

    private void rotate(List<Integer> nums, int begin, int end) {
        for (int i = begin, j = end - 1; i < j; i++, j--) {
            int a = nums.get(i), b = nums.get(j);
            a ^= b;
            b ^= a;
            a ^= b;
            nums.set(i, a);
            nums.set(j, b);
        }
    }
}
