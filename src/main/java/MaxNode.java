import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxNode {

    private static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    /*
     * @param root: the root of tree
     * @return: the max node
     */
    public TreeNode maxNode(TreeNode root) {
        // write your code here
        if (root == null || (root.left == null && root.right == null)) return root;

        Queue<TreeNode> nodes = new LinkedList<>();
        int maxVal = 0;
        TreeNode max = null;
        nodes.add(root);

        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            if (max == null || maxVal < node.val) {
                max = node;
                maxVal = max.val;
            }

            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }

        return max;
    }
}
