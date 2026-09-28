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
    // public ListNode reverseLL(ListNode head){
    //     ListNode cur=head;
    //     ListNode prev=null;
    //     while(cur!=null){
    //         ListNode temp=cur.next;
    //         cur.next=prev;
    //         prev=cur;
    //         cur=temp;
    //     }
    //     return prev;
    // }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null ) return head;
        if(head.next==null) {
            if(n==1) return null;
            else return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null) return head.next;

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;

        return head;
    }
}