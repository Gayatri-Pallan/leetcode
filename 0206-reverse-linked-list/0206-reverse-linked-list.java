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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next ==null) return head;
        ListNode one = head;
        ListNode two = head.next;
        one.next = null;
        while(two!=null){
            ListNode temp = two.next;
            two.next = one;
            //one.next= null;
            one = two;
            two = temp;
        }

        return one;


        
    }
}