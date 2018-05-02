import java.util.*;

public class BinaryTree {

    /*
     * Definition of TreeNode:
     */
    private static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    /**
     * @param root: A Tree
     * @return: Preorder in ArrayList which contains node values.
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> result = new LinkedList<>();

        if (root != null) {
            Deque<TreeNode> stack = new LinkedList<>();

            stack.add(root);

            while (!stack.isEmpty()) {
                TreeNode node = stack.poll();
                result.add(node.val);

                if (node.right != null) {
                    stack.push(node.right);
                }

                if (node.left != null) {
                    stack.push(node.left);
                }
            }
        }
        return result;
    }

    /**
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> result = new LinkedList<>();

        if (root != null) {
            Deque<TreeNode> nodes = new LinkedList<>();

            while (!nodes.isEmpty() || root != null) {
                if (root != null) {
                    nodes.push(root);
                    root = root.left;
                } else {
                    root = nodes.pop();
                    result.add(root.val);
                    root = root.right;
                }
            }
        }
        return result;
    }

    /**
     * @param root: A Tree
     * @return: Postorder in ArrayList which contains node values.
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> result = new LinkedList<>();

        postorderTraversal(root, result);

        return result;
    }

    private void postorderTraversal(TreeNode root, List<Integer> result) {
        // write your code here
        if (root != null) {
            postorderTraversal(root.left, result);
            postorderTraversal(root.right, result);
            result.add(root.val);
        }
    }

    /**
     * @param root: A Tree
     * @return: Level order a list of lists of integer
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here

        List<List<Integer>> result = new LinkedList<>();

        if (root != null) {
            Queue<TreeNode> nodes = new LinkedList<>();

            nodes.add(root);

            while (!nodes.isEmpty()) {
                int size = nodes.size();

                List<Integer> level = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    TreeNode node = nodes.poll();

                    level.add(node.val);

                    if (node.left != null) {
                        nodes.add(node.left);
                    }

                    if (node.right != null) {
                        nodes.add(node.right);
                    }
                }
                result.add(level);
            }
        }

        return result;
    }

    /*
    * @param root: The root of the binary search tree.
    * @param node: insert this node into the binary search tree
    * @return: The root of the new binary search tree.
    */
    public TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
        if (root == null) return node;

        if (node == null) return root;

        TreeNode p = root, curr = root;
        while (curr != null) {
            p = curr;

            if (curr.val == node.val) break;
            else if (curr.val > node.val) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }

        if (p.val > node.val) {
            p.left = node;
        } else {
            p.right = node;
        }

        return root;
    }

    /**
     * @param root: The root of binary tree.
     * @return: An integer
     */
    public int maxDepth(TreeNode root) {
        // write your code here
        if (root == null) return 0;

        int maxDepth = 0;
        Queue<TreeNode> nodes = new LinkedList<>();

        nodes.add(root);

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodes.poll();

                if (node.left != null) nodes.add(node.left);
                if (node.right != null) nodes.add(node.right);
            }
            maxDepth++;
        }

        return maxDepth;
    }

    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if (root == null) return true;

        boolean[] result = new boolean[1];

        result[0] = true;

        getHeight(root, 1, result);

        return result[0];
    }

    private int getHeight(TreeNode node, int level, boolean[] result) {
        if (node == null) {
            return level - 1;
        }

        int leftHeight = getHeight(node.left, level + 1, result);

        if (!result[0]) return level;

        int rightHeight = getHeight(node.right, level + 1, result);

        if (!result[0]) return level;

        if (Math.abs(leftHeight - rightHeight) > 1) result[0] = false;

        return Math.max(leftHeight, rightHeight);
    }

    boolean isCompleteTreeNode(TreeNode root) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        boolean result = true;
        boolean hasNoChild = false;
        while (!queue.isEmpty()) {
            TreeNode current = queue.remove();
            if (hasNoChild) {
                if (current.left != null || current.right != null) {
                    result = false;
                    break;
                }
            } else {
                if (current.left != null && current.right != null) {
                    queue.add(current.left);
                    queue.add(current.right);
                } else if (current.left != null && current.right == null) {
                    queue.add(current.left);
                    hasNoChild = true;

                } else if (current.left == null && current.right != null) {
                    result = false;
                    break;
                } else {
                    hasNoChild = true;
                }
            }

        }
        return result;
    }


}
