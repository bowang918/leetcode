import org.junit.Test;

public class AsciiTest {
    @Test
    public void test() {
        System.out.println(String.format("a:%d, A:%d", (int) 'a', (int) 'A'));
        System.out.println(String.format("z:%d, Z:%d", (int) 'z', (int) 'Z'));

        for (int i = 65; i <= 90; i++) {
            System.out.print(String.format("'%c', ", (char) i));
//            System.out.print(", ");
        }
    }
}
