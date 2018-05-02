public class AplusB {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        // write your code here

        int sum = 0, carry = 0;
        do {
            sum = a ^ b;
            carry = (a & b) << 1;

            a = sum;
            b = carry;
        } while (carry != 0);
        return sum;
    }

    public void swap(int a, int b) {
        // write your code here
        System.out.println(String.format("a:%d, b:%d", a, b));

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(String.format("a:%d, b:%d", a, b));
    }
}
