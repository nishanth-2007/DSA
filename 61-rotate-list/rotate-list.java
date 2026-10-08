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
    public ListNode findTailNode(ListNode temp,int k){
        int cnt=1;
        while(temp!=null){
            if(cnt==k) return temp;
            cnt++;
            temp=temp.next;
        }
        return null;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        ListNode tail=head;
        int cnt=1;
        while(tail.next!=null){
            cnt++;
            tail=tail.next;
        }
        if(k%cnt==0) return head;
        k=k%cnt;
        tail.next=head;
        ListNode newTail=findTailNode(head,cnt-k);
        head=newTail.next;
        newTail.next=null;
        return head;
    }
}