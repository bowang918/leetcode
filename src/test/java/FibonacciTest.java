import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void test() {
        Fibonacci fibonacci = new Fibonacci();
        for (int i = 0; i < 10; i++) {
            Assert.assertTrue(fibonacci.solution2(i) == fibonacci.solution1(i));
        }
    }

    @Test
    public void beanchmark() {
        Fibonacci fibonacci = new Fibonacci();
        int capacity = 1000000;
        int[] result = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            long sart = System.currentTimeMillis();
            result[i] = fibonacci.solution1(i);
            long end = System.currentTimeMillis();
            System.out.println(String.format("fibonacci(%d) iterate cost:%dms", i, (end - sart)));


        }
    }

    @Test
    public void beanchmark2() {
        Fibonacci fibonacci = new Fibonacci();
        int capacity = 100;
        int[] result = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            long sart = System.currentTimeMillis();
            result[i] = fibonacci.solution2(i);
            long end = System.currentTimeMillis();
            System.out.println(String.format("fibonacci(%d) recursive cost:%dms", i, (end - sart)));


        }
    }

}
