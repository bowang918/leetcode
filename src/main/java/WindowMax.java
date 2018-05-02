import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class WindowMax {

    public int[] getWindowMax(int[] data, int w) {
        if (data == null || data.length < 1 || w < 1) {
            return new int[0];
        }

        int[] result = new int[data.length - w + 1];
        int index = 0;

        Deque<Integer> qmax = new LinkedList<>();
        for (int i = 0; i < data.length; i++) {
            while (!qmax.isEmpty() && data[qmax.peekLast()] <= data[i]) {
                qmax.pollLast();
            }
            qmax.addLast(i);

            // out of window
            if (qmax.peekFirst() <= i - w) {
                qmax.pollFirst();
            }

            //start the window
            if (i > w - 1) {
                result[index++] = data[qmax.peekFirst()];
            }
        }

        return result;
    }

    /*
    * @param nums: A list of integers
    * @param k: An integer
    * @return: The maximum number inside the window at each moving
    */
    public ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
        // write your code here
        int length = nums.length;
        if (null == nums || length < 1 || k < 1) {
            return new ArrayList<>(0);
        }
        k = k > length ? length : k;

        ArrayList<Integer> result = new ArrayList<>(length - k + 1);
        Deque<Integer> qMax = new LinkedList<>();

        for (int i = 0; i < length; i++) {

            //out of window
            if (qMax.peekFirst() <= i - k) {
                qMax.pollFirst();
            }

            while (!qMax.isEmpty() && nums[qMax.peekLast()] <= nums[i]) {
                qMax.pollLast();
            }

            qMax.addLast(i);


            if (i > k - 1) {
                result.add(nums[qMax.peekFirst()]);
            }
        }

        return result;
    }

}
