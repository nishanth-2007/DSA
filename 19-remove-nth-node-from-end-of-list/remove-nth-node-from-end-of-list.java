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
        // if(head.next==null){
        //     if(n==1) return null;
        //     else return head;
        // }
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt==n){
            return head.next;
        }
        int req=(cnt-n+1);
        cnt=0;
        temp=head;
        ListNode prev=null;
        while(temp!=null){
            cnt++;
            if(cnt==req){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}