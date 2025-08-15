/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(p.val<q.val){
            return lowest(root,p,q);
        }
        return lowest(root,q,p);
    }
    public TreeNode lowest(TreeNode root,TreeNode p,TreeNode q){
        if(root.val>=p.val && root.val<=q.val){
            return root;
        }
        if(root.val>q.val){
            return lowest(root.left,p,q);
        }
        return lowest(root.right,p,q);
    }
}