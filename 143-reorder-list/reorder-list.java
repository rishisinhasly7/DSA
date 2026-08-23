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
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null; 
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }

    public void reorderList(ListNode head) {

        if(head == null || head.next == null){
            return ;
        }

        ListNode mid = findMid(head);
        ListNode sHead = reverseList(mid);
        ListNode curr = head;
        ListNode prevCurr = null;
        ListNode prevsHead = null;

        while(curr != null && sHead != null){
            prevsHead = sHead;
            prevCurr = curr;
            ListNode temp1 = curr.next;
            ListNode temp2 = sHead.next;
            curr.next = sHead;
            sHead.next = temp1;
            curr = temp1;
            sHead = temp2;
        }        

        if(sHead != null){
           prevCurr.next.next = sHead;
        }
        if(curr != null){
           prevsHead.next.next = curr;
        }
        
    }
}