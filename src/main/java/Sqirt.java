public class Sqirt {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        long result = x;

        while (result * result > x) {
            result = (result + result / x) / 2;
        }

        return (int) result;
    }

    /**
     * @param n: An integer
     * @return: True or false
     */
    public boolean checkPowerOf2(int n) {
        // write your code here
        if(n < 0)
            return false;
        else {
            return (n & (n - 1)) == 0;
        }
    }
}
