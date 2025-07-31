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

class Solution {
    public List<List<Integer>> levelOrder2(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
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
            // Add each level at the front to get bottom-up order
            ans.add(0, res);
        }
        return ans;
    }

    // Optional: main method to test
    public static void main(String[] args) {
        /*
         Example tree:
               3
              / \
             9  20
                /  \
               15   7
         */
        TreeNode root = new TreeNode(3, 
                          new TreeNode(9), 
                          new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        
        Solution sol = new Solution();
        List<List<Integer>> result = sol.levelOrderBottom(root);
        System.out.println(result); // Output: [[15, 7], [9, 20], [3]]
    }
}
