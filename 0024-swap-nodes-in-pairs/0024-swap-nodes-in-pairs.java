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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next ==null){return head;}
        ListNode ans=new ListNode(-1);
        ListNode ans1=ans;
        ListNode t1=head;
        ListNode t2=head.next;
        while(t1!=null && t1.next!=null)
        {

           int temp=t1.val;
           t1.val=t2.val;
           t2.val=temp;
           if(t2.next==null){break;}
           t1=t2.next;
           t2=t1.next;

           /* ans1.next=t2;
            t1.next=t2.next;
            t2.next=t1;
            ans1=t1;
            if(t1.next==null){break;}
            t1=t1.next;
            t2=t1.next;*/
            
        }
        return head;
    }
}