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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
        ListNode ath=new ListNode();
        ListNode bth=new ListNode();
        while(list1.next!=null){
            if(a==1){
                ath=list1;
            }
            if(b==0){
                bth=list1.next;
            }
            a--;
            b--;
            list1=list1.next;
        } 
        ath.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=bth;

        
    return temp;
    }
}