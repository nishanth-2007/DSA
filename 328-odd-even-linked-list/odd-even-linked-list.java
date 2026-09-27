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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        int cnt=0;
        ListNode headO=new ListNode();
        ListNode headE=new ListNode();
        ListNode tempO=headO;
        ListNode tempE=headE;
        while(temp!=null){
            cnt++;
            if(cnt%2!=0){
                //odd
                ListNode newNode=new ListNode(temp.val);
                tempO.next=newNode;
                tempO=tempO.next;
            }
            if(cnt%2==0){
                //even
                ListNode newNode=new ListNode(temp.val);
                tempE.next=newNode;
                tempE=tempE.next;
            }
            temp=temp.next;
        }
        tempO.next=headE.next;
        return headO.next;
    }
}