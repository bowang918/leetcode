import com.sun.deploy.util.StringUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ProductExcludeItselfTest {

    @Test
    public void testBalanceNumber() {
        int[] data = new int[]{1, 3, 5, 7, 8, 25, 4, 20};
        int index = new ProductExcludeItself().balanceNumber(data);
        System.out.println(String.format("Index:%d, balance Number:%d", index, data[index]));
    }

    @Test
    public void test() {
        List<Integer> data = Arrays.asList(1, 2, 3);
        new ProductExcludeItself().productExcludeItself(data);
    }
}
