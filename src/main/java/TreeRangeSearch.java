import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeRangeSearch {

    private static class TreeNode {
        int val;
        TreeNode left, right;

        private TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    /**
     * @param root: param root: The root of the binary search tree
     * @param k1:   An integer
     * @param k2:   An integer
     * @return: return: Return all keys that k1<=key<=k2 in ascending order
     */
    public List<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
        List<Integer> result = new ArrayList<>();

        searchRange(root, k1, k2, result);

        return result;
    }

    private void searchRange(TreeNode root, int k1, int k2, List<Integer> result) {
        // write your code here
        if (root == null) return;


        if (k1 < root.val) searchRange(root.left, k1, k2, result);

        if (k1 <= root.val && root.val <= k2) result.add(root.val);

        if (root.val < k2) searchRange(root.right, k1, k2, result);

    }

    /**
     * @param root: The root of binary tree
     * @return: An integer
     */
    public int minDepth(TreeNode root) {
        // write your code here
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        int depth = 0;
        outer:
        while (!nodes.isEmpty()) {
            depth++;
            int size = nodes.size();
            for (; size > 0; size--) {
                TreeNode node = nodes.poll();
                if (node.left == null && node.right == null) {
                    break outer;
                }
                if (node.left != null) nodes.add(node.left);
                if (node.right != null) nodes.add(node.right);
            }
        }
        return depth;
    }
}
