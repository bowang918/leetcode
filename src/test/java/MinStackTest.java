import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {

    @Test
    public void test() {
        MinStack<Integer> stack = new MinStack<>();

        stack.push(6);

        Assert.assertTrue(stack.min() == 6);

        stack.push(6);

        Assert.assertTrue(stack.min() == 6);

        stack.pop();
        Assert.assertTrue(stack.min() == 6);

        stack.push(3);
        stack.push(2);
    }
}
