import org.junit.Test;

public class SortingTest {

    @Test
    public void test() {
        int[] A = new int[]{3, 2, 1, 4, 5};


        Sorting.InsertSort.insertSort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
