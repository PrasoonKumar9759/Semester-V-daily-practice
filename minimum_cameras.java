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
    int camera=0;
    public int minCameraCover(TreeNode root) {
        int c=minCamera(root);
        if(c==-1){
            camera++;
        }return camera;
        
    }
    public int minCamera(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=minCamera(root.left);
        int right=minCamera(root.right);
        if(left==-1 || right==-1){ //-1 tells need of camera on this node
            camera++;
            return 1;// camera setup kara 

        }
        else if(left==1 || right==1){ // 1 inme kisi ek ke pass ya dono ke pass camera h
            return 0;// iska mtlb covered h
        }
        else{
            return -1; // need camera
        }

    }
}