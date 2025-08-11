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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left==null && root.right==null){
            return 0;
        }
        int r=0,l=0;
        if(root.left!=null){
            l=sum(root.left,true);
        }
        if(root.right!=null){
            r=sum(root.right,false);
        }
        return r+l;
    }
    public int sum(TreeNode root,boolean s){
        if(root.left==null && root.right==null && s){
            return root.val;
        }
        else if(root.left==null && root.right==null){
            return 0;
        }
        int r=0,l=0;
        if(root.left!=null){
            l=sum(root.left,true);
        }
        if(root.right!=null){
            r=sum(root.right,false);
        }
        return r+l;


    }
}