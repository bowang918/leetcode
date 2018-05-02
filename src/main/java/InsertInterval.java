import java.util.*;

public class InsertInterval {
    /**
     * @param intervals:   Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        if (intervals == null || newInterval == null) return intervals;

        List<Interval> result = new LinkedList<>();

        for (Interval interval : intervals) {
            int a = interval.start, b = interval.end,
                    c = newInterval.start, d = newInterval.end;

            if (b < c || d < a) {
                result.add(interval);
            } else {
                newInterval.start = Math.min(a, c);
                newInterval.end = Math.max(b, d);
            }
        }
        result.add(newInterval);

        result.sort(Comparator.comparingInt(o -> o.start));
        return result;
    }

    public class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
