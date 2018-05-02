public class DigitCounts {
    /*
     * @param : An integer
     * @param : An integer
     * @return: An integer denote the count of digit k in 1..n
     */
    public int digitCounts(int k, int n) {
        // write your code here
        return solution1(k, n);

    }

    public int solution1(int k, int n) {

        if (n < 0 || k < 0 || n < k) {
            return 0;
        }

        if (k == 0 && n < 10)
            return 1; // 特殊情况

        int count = n > k ? 1 : 0;
        for (int i = 10; i <= n; i++) {
            int tmp = i;
            while (tmp > 0) {
                if (((tmp % 10) ^ k) == 0) {
                    count++;
//                    break;
                }
                tmp /= 10;
            }
        }

        return count;
    }

    public int solution2(int k, int n) {
        if (k == 0 && n < 10)
            return 1; // 特殊情况

        int temp = n, count = 0, pow = 1;//pow代表当前位的后面低位是多少，1为个位，10为十位，100位千位

        while (temp != 0) {
            int digit = temp % 10; // 根据当前位置数和k的大小关系，可以算出当前位置出现过k的次数
            if (digit < k)
                count += (temp / 10) * pow;
            else if (digit == k)
                count += (temp / 10) * pow + (n - temp * pow + 1);
            else {
                if (!(k == 0 && temp / 10 == 0)) // 排除没有更高位时，寻找的数为0的情况
                    count += (temp / 10 + 1) * pow;
            }
            temp /= 10;
            pow *= 10;
        }
        return count;
    }


}
