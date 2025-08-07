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
    public boolean isBalanced(TreeNode root) {
        return isBalance(root).isBalanced;
        
    }
    private BalancedPair isBalance(TreeNode node) {
			// write your code here
            if(node==null){
                return new BalancedPair();
            }
            BalancedPair lbp=isBalance(node.left);
            BalancedPair rbp=isBalance(node.right);
            BalancedPair sbp=new BalancedPair();

            sbp.height=Math.max(lbp.height,rbp.height)+1;
            sbp.isBalanced=lbp.isBalanced && rbp.isBalanced && (Math.abs(lbp.height-rbp.height)<=1);

            return sbp;
			
		}

		private class BalancedPair {
			int height=-1;
			boolean isBalanced=true;
		}
}