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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        call(root1,l1);
        call(root2,l2);
        // System.out.print(l1);
        // System.out.print(l2);
        for(int i:l2) l1.add(i);
        Collections.sort(l1);
        return l1;
    }
    public void call(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        call(root.left,list);
        call(root.right,list);
    }
}