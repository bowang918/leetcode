public class SearchInsert {
    /**
     * @param A:      an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        return solution1(A, target);
    }

    private int solution1(int[] A, int target) {
        // write your code here
        int length;
        if (A == null || (length = A.length) < 1) return 0;

        int index = 0;
        while (index < length && A[index] < target) {
            index++;
        }
        return index == length ? -1 : index;
    }

    private int solution2(int[] A, int target) {
        // write your code here
        int length;
        if (A == null || (length = A.length) < 1) return 0;

        return binarySearch(A, target, 0, length);
    }

    private int binarySearch(int[] A, int target, int start, int end) {

        if (start < end) {
            int index = (start + end) >> 1;
            if (A[index] == target) return index;
            else if (A[index] > target) return binarySearch(A, target, start, index);
            else return binarySearch(A, target, index, end);
        }
        return start;
    }
}
