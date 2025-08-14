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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return create(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
    public TreeNode create(int[] indr,int[] psdr,int ilo,int ihi,int plo,int phi){
        if(ilo>ihi || plo>phi){
            return null;
        }
        TreeNode nn=new TreeNode(psdr[phi]);
        int idx=search(indr,ilo,ihi,psdr[phi]);
        int c=idx-ilo;
        nn.left=create(indr,psdr,ilo,idx-1,plo,plo+c-1);
        nn.right=create(indr,psdr,idx+1,ihi,plo+c,phi-1);
        return nn;
    }
    public int search(int[] indr,int s,int e,int item){
        for(int i=s;i<=e;i++){
            if(indr[i]==item) return i;
        }
        return 0;
    }
}