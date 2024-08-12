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
    public ListNode partition(ListNode head, int x) {
        ListNode p1=new ListNode(-1);
        ListNode pp1=p1;
        ListNode p2=new ListNode(-1);
        ListNode pp2=p2;
        while(head!=null)
        {
           if(head.val<x)
           {
            p1.next=head;
            p1=p1.next;
           }
           else
           {
            p2.next=head;
            p2=p2.next;
           }
           head=head.next;
        }
        p1.next=pp2.next;
        p2.next=null;
        return pp1.next;
        
       

    }
}