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
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = new ListNode();
        prev.next = head;
        while(fast != null && fast.next != null){
            prev = prev.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return ;

        ListNode mid = findMid(head);
        ListNode secondHead = reverse(mid);
        ListNode prev = null;
        while(head != null && secondHead != null){
            ListNode temp1 = head.next;
            ListNode temp2 = secondHead.next;
            head.next = secondHead;
            secondHead.next = temp1;
            prev = secondHead;
            head = temp1;
            secondHead = temp2;
        }
       if(secondHead != null) prev.next = secondHead;
    }
}