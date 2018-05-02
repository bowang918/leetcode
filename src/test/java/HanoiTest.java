import com.sun.deploy.util.StringUtils;
import org.junit.Test;

public class HanoiTest {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    @Test
    public void test() {
        Hanoi.solution1(1);
    }

    @Test
    public void test2() {
        Hanoi.solution1(2);
    }

    @Test
    public void test3() {
        Hanoi.solution1(3);
    }

//    @Test
//    public void test11() {
//        System.out.println(StringUtils.join(Hanoi.solution1(1), LINE_SEPARATOR));
//    }
//
//    @Test
//    public void test12() {
//        System.out.println(StringUtils.join(Hanoi.solution1(2), LINE_SEPARATOR));
//    }
//
//    @Test
//    public void test13() {
//        System.out.println(StringUtils.join(Hanoi.solution1(3), LINE_SEPARATOR));
//    }
//    @Test
//    public void test14() {
//        System.out.println(StringUtils.join(Hanoi.solution1(14), LINE_SEPARATOR));
//    }

    @Test
    public void test4() {
        Hanoi.solution2(1);
    }

    @Test
    public void test5() {
        Hanoi.solution2(2);
    }

    @Test
    public void test6() {
        Hanoi.solution2(3);
    }
}
