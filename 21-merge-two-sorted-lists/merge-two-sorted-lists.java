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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode head=new ListNode();
        ListNode temp=head;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                ListNode newNode=new ListNode(t1.val);
                temp.next=newNode;
                temp=newNode;
                t1=t1.next;
            }
            else{
                ListNode newNode=new ListNode(t2.val);
                temp.next=newNode;
                temp=newNode;
                t2=t2.next;
            }
        }
        if(t1!=null){
            temp.next=t1;
        }
        if(t2!=null){
            temp.next=t2;
        }
        return head.next;
    }
}