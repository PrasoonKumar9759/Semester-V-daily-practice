/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    int maxdep=0;
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ll=new ArrayList<>();
        if(root==null){
            return ll;
        }
        call(ll,root,1);
        return ll;
    }
    void call(ArrayList<Integer> ll,Node root,int curr){
        if(root==null){
            return;
        }        
        if(curr>maxdep){
            ll.add(root.data);
            maxdep=curr;
        }
        call(ll,root.left,curr+1);
        call(ll,root.right,curr+1);
    }
}