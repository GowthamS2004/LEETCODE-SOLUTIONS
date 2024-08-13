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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode ans=new ListNode(-1);
        ListNode ans1=ans;
        while(head!=null)
        {
            if(head.val==val)
            {
                head=head.next;
            }
            else
            {
                ans1.next=head;
                ans1=ans1.next;
                head=head.next;
            }
        }
        ans1.next=null;
        return ans.next;
    }
}