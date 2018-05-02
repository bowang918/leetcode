import java.util.Arrays;

public class TwoSum {
    /**
     * @param numbers: An array of Integer
     * @param target:  target = numbers[index1] + numbers[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        return solution1(numbers, target);
    }

    private int[] solution1(int[] numbers, int target) {
        // write your code here
        int length;
        if (numbers == null || (length = numbers.length) < 2) return null;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++)
                if (numbers[i] + numbers[j] == target) return new int[]{i, j};
        }
        return null;
    }

    private int[] solution2(int[] numbers, int target) {
        // write your code here
        int length;
        if (numbers == null || (length = numbers.length) < 2) return null;

        Arrays.sort(numbers);

        int i = 0, j = length - 1;
        while (i < j) {
            int temp = numbers[i] + numbers[j];
            if (target == temp) {
                return new int[]{i + 1, j + 1};
            } else if (target > temp) {
                i++;
            } else {
                j--;
            }
        }

        return null;
    }
}
