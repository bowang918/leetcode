import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class StackSorterTest {

    @Test
    public void test() {
        Deque<Integer> source = new ArrayDeque<>(Arrays.asList(6, 2, 1, 3, 5, 7, 9));

        StackSorter.sort(source);

        Iterator<Integer> it = source.iterator();
        Integer prev = null;
        while (it.hasNext()) {
            Integer cur = it.next();
            if (prev != null) {
                Assert.assertTrue(prev <= cur);
            }
            prev = cur;
        }
    }
}
