import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Permute {
    /*
    * @param nums: A list of integers.
    * @return: A list of permutations.
    */
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();

        permute(nums, 0, nums.length, result);

        return result;
    }

    private void permute(int[] nums, int begin, int end, List<List<Integer>> result) {
        if (begin == end) {
            result.add(Arrays.stream(nums).boxed().collect(toList()));
        } else {
            for (int i = begin; i < end; i++) {
                // swap
                swap(nums, begin, i);
                permute(nums, begin + 1, end, result);
                // reset swap
                swap(nums, i, begin);
            }
        }
    }

    private void swap(int[] nums, int from, int to) {
        if (from == to) {
            return;
        }
        int tmp = nums[from];
        nums[from] = nums[to];
        nums[to] = tmp;
    }
}
