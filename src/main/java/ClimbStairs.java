public class ClimbStairs {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if (n < 1) return 0;

        if (n < 3) return n;

        int a = 1, b = 1;

        while ((n--) > 2) {
            b += a;
            a = b - a;
        }
        return b;
    }
}
