public class ReverseInt {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        return solution1(number);
    }

    private int solution1(int number) {
        // write your code here
        if (number < 100 || 1000 <= number) throw new IllegalArgumentException("");
        int[] digits = new int[3];
        int index = 0;
        while (number > 0) {
            digits[index++] = number % 10;
            number = number / 10;
        }
        for (int i = 0; i < index; i++) {
            number = number * 10 + digits[i];
        }
        return number;
    }

    private int solution2(int number) {
        // write your code here
        if (number < 100 || 1000 <= number) throw new IllegalArgumentException("");

        //digit, ten, hundred
        return (number % 10) * 100 + ((number / 10) % 10) * 10 + (number / 100);
    }


}
