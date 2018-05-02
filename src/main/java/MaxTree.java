import java.util.*;
import java.util.stream.Collectors;

public class MaxTree {

    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node maxTree(int[] a) {

        int length;
        if (a == null || (length = a.length) < 1) {
            return null;
        }

        List<Node> nodes = Arrays.stream(a).mapToObj(Node::new).collect(Collectors.toList());

        Deque<Node> stack = new LinkedList<>();

        Map<Node, Node> leftBigMap = new HashMap<>();
        Map<Node, Node> rightBigMap = new HashMap<>();

        for (Node node : nodes) {

            while (!stack.isEmpty() && stack.peek().value < node.value) {
                popStackAndSetMap(stack, leftBigMap);
            }

            stack.push(node);
        }

        while (!stack.isEmpty()) {
            popStackAndSetMap(stack, leftBigMap);
        }

        for (int i = a.length - 1; i > 0; i--) {

        }

        return null;
    }

    private void popStackAndSetMap(Deque<Node> stack, Map<Node, Node> map) {
        Node node = stack.pop();

        if (stack.isEmpty()) {
            map.put(node, null);
        } else {
            map.put(node, stack.peek());
        }
    }
}
