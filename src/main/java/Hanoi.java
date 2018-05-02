public class Hanoi {

    private static final String LEFT = "A";
    private static final String MIDDLE = "B";
    private static final String RIGHT = "C";


    public static void solution1(int n) {
        solution1(n, LEFT, MIDDLE, RIGHT);
    }

    public static void solution2(int n) {
        solution2(n, LEFT, RIGHT);
    }

    private static void solution1(int n, String left, String middle, String right) {
        if (n > 0) {
            solution1(n - 1, left, right, middle);
            System.out.println(String.format("%d:[%s -> %s]", n, left, right));
            solution1(n - 1, middle, left, right);
        }
    }

    private static void solution2(int n, String from, String to) {
        if (n > 0) {
            solution2(n - 1, from, to);
            System.out.println(String.format("%d:[%s -> %s]", n, from, MIDDLE));
            solution2(n - 1, to, from);
            System.out.println(String.format("%d:[%s -> %s]", n, MIDDLE, to));
            solution2(n - 1, from, to);
        }
    }
}
