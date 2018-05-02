public class MergeSortedArray {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        if (A == null) {
            return B;
        }

        if (B == null) {
            return A;
        }

        int[] result = new int[A.length + B.length];
        int left = 0, right = 0, index = 0;

        while (left < A.length && right < B.length) {
            if (A[left] < B[right]) {
                result[index++] = A[left++];
            } else {
                result[index++] = B[right++];
            }
        }
        while (left < A.length) {
            result[index++] = A[left++];
        }
        while (right < B.length) {
            result[index++] = B[right++];
        }
        return result;
    }

    /*
    * @param A: sorted integer array A which has m elements, but size of A is m+n
    * @param m: An integer
    * @param B: sorted integer array B which has n elements
    * @param n: An integer
    * @return: nothing
    */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here

        if (A == null || B == null || n > B.length || m > A.length || m + n > A.length) return;

        int i = m - 1, j = n - 1, index = A.length - 1;

        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[index--] = A[i--];
            } else {
                A[index--] = B[j--];
            }
        }

        while (i >= 0) {
            A[index--] = A[i--];
        }

        while (j >= 0) {
            A[index--] = B[j--];
        }
    }
}
