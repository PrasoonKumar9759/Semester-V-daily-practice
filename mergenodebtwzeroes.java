/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ListNode first=head;
        ListNode last=head;
        int s=0;
        while(last.next!=null){
           last=last.next;
           s+=last.val;
           if(last.val==0){
            ListNode ln=new ListNode(s);
            first.next=ln;
            first=first.next;
            s=0;
           }
        }
        return temp.next;

    }
}