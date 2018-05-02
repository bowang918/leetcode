import org.junit.Test;

public class Swap {
    @Test
    public void test() {
        int a = 1, b = 0;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(String.format("a,b, %d, %d", a, b));
    }
}
