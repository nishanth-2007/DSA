/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // public ListNode collision(ListNode temp1,ListNode temp2,int d){
    //     for(int i=0;i<d;i++) temp1=temp1.next;
    //     while(temp1!=null){
    //         if(temp1==temp2) return temp1;
    //         temp1=temp1.next;
    //         temp2=temp2.next;
    //     }
    //     return null;
    // }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        while(temp1 !=  temp2){
            temp1=temp1.next;
            temp2=temp2.next;

            if(temp1==temp2) return temp1;

            if(temp1==null) temp1=headB;
            if(temp2==null) temp2=headA;
        }
        return temp1;
    }
}