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
    public ListNode reverseLL(ListNode head){
        ListNode cur=head;
        ListNode prev=null;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null ) return head;
        ListNode reverseHead=reverseLL(head);
        if(n==1){
            reverseHead= reverseHead.next;
            return reverseLL(reverseHead);
        }
        int cnt=0;
        ListNode temp=reverseHead;
        ListNode prev=null;
        while(temp!=null){
            cnt++;
            if(cnt==n){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        ListNode originalHead=reverseLL(reverseHead);
        return originalHead;
    }
}