/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode meet=hasCycle(head);
        if(meet==null){
            return null;
        }
        ListNode s=head;
        while(meet!=s){
            s=s.next;
            meet=meet.next;
        }
        return s;
    }
    public ListNode hasCycle(ListNode head){
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){
                return s;
            }
        }
    return null;
    }
}