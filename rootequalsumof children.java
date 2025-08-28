/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean checkTree(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return true;

        boolean left=checkTree(root.left);
        boolean right=checkTree(root.right);

        int l=root.left.val;
        int r=root.right.val;

        return left && right && (root.val==(l+r));
    }
}