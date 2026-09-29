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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return null;
        ListNode temp=head;
        ListNode prev=null;
        ListNode mid=null;
        int cnt=0;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        int req=(cnt/2)+1;
        temp=head;
        cnt=0;
        while(temp!=null){
            cnt++;
            if(cnt== req-1){
                prev=temp;
            }
            if(cnt==req){
                mid=temp;
                break;
            }
            temp=temp.next;
        }
        prev.next=mid.next;
        return head;
    }
}