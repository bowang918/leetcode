public class Fibonacci {

    public int solution1(int n) {

        if (n < 0) throw new IllegalArgumentException("");

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int fn1 = 0, fn2 = 1;

        for (int i = 2; i <= n; i++) {
            fn2 = fn1 + fn2;
            fn1 = fn2 - fn1;
        }

        return fn2;

    }

    public int solution2(int n) {
        if (n < 0) throw new IllegalArgumentException("");
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return solution2(n - 1) + solution2(n - 2);
    }
}
