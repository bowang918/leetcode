import com.sun.deploy.util.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecoverRotatedSortedArrayTest {

    @Test
    public void test() {
        List<Integer> nums = Arrays.asList(4, 5, 1, 2, 3);

        new RecoverRotatedSortedArray().recoverRotatedSortedArray(nums);

        System.out.println(StringUtils.join(nums, ","));
    }
}
