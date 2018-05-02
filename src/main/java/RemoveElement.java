public class RemoveElement {
    /*
 * @param A: A list of integers
 * @param elem: An integer
 * @return: The new length after remove
 */
    public int removeElement(int[] A, int elem) {
        // write your code here
        int length;
        if (A == null || (length = A.length) < 1) return 0;

        int index = 0;
        for (int cur = 0; cur < length; cur++) {
            if (A[cur] != elem) {
                A[index++] = A[cur];
            }
        }

        return index;
    }
}
