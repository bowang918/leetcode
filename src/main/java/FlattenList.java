import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlattenList {


    // This is the interface that allows for creating nested lists.
    // You should not implement it, or speculate about its implementation
    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer,
        // rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds,
        // if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds,
        // if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }

    // @param nestedList a list of NestedInteger
    // @return a list of integer
    public List<Integer> flatten(List<NestedInteger> nestedList) {
        // Write your code here
        List<Integer> result = new LinkedList<>();

        if (nestedList != null && nestedList.size() > 0) {
            flatten(nestedList, result);
        }

        return result;
    }

    // @param nestedList a list of NestedInteger
    // @return a list of integer
    private void flatten(List<NestedInteger> nestedList, List<Integer> result) {
        for (NestedInteger item : nestedList) {
            if (item.isInteger()) {
                result.add(item.getInteger());
            } else {
                flatten(item.getList(), result);
            }
        }
    }

    // @param nestedList a list of NestedInteger
    // @return a list of integer
    private void flatten2(List<NestedInteger> nestedList, List<Integer> result) {
        Deque<NestedInteger> deque = new LinkedList<>(nestedList);
        while (!deque.isEmpty()) {
            NestedInteger item = deque.pollFirst();
            if (item.isInteger()) {
                result.add(item.getInteger());
            } else if (item.getList() != null) {
                List<NestedInteger> children = new ArrayList<>(item.getList());
                int index = children.size();
                for (; index > 0; ) {
                    deque.addFirst(children.get(--index));
                }
            }
        }
    }
}
