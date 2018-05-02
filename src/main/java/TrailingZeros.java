public class TrailingZeros {
    /*
    * @param n: An integer
    * @return: An integer, denote the number of trailing zeros in n!
    */
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long q = n, count = 0;
        while (q != 0) {
            count += q / 5;
            q /= 5;
        }
        return count;
    }
}
