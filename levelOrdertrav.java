import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LevelOrderTrav {
    static class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null) return ans;

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                List<Integer> res = new ArrayList<>();
                int n = q.size();
                for (int i = 0; i < n; i++) {
                    TreeNode nn = q.remove();
                    res.add(nn.val);
                    if (nn.left != null) q.add(nn.left);
                    if (nn.right != null) q.add(nn.right);
                }
                ans.add(res);
            }
            return ans;
        }
    }

    // Optional: main method to test
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, 
            new TreeNode(2, new TreeNode(4), new TreeNode(5)),
            new TreeNode(3)
        );
        Solution sol = new Solution();
        System.out.println(sol.levelOrder(root)); // Output: [[1], [2, 3], [4, 5]]
    }
}
