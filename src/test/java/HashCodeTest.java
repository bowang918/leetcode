import org.junit.Test;

public class HashCodeTest {

    @Test
    public void test() {
        char[] s = "ubuntu".toCharArray();
        System.out.println(new HashCode().hashCode(s, 1007));
    }
}
