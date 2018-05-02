import java.util.*;

public class UglyNumber {


    public int solution2(int n) {

        if (n < 1) {
            throw new IllegalArgumentException(" n can't less than one!");
        }

        int[] numbers = new int[n];

        int i = 0, j = 0, k = 0, index = 0;

        numbers[index++] = 1;

        if (n > 1) {

            while (index < n) {
                int min = min(numbers[i] * 2, numbers[j] * 3, numbers[k] * 5);
                numbers[index++] = min;

                while (numbers[i] * 2 <= min)
                    i++;
                while (numbers[j] * 3 <= min)
                    j++;
                while (numbers[k] * 5 <= min)
                    k++;
            }
        }
        return numbers[n - 1];
    }

    private int min(int m2, int m3, int m5) {
        return Math.min(Math.min(m2, m3), m5);
    }
}
