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
    public ListNode FindMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = new ListNode();
        prev.next = head;
        while(fast != null && fast.next != null){
            prev = prev.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode mid = FindMid(head);
        ListNode secondhead = reverse(mid);
        mid.next = null;
        while(head != null && secondhead != null){
            if(head.val != secondhead.val) return false;
            head = head.next;
            secondhead = secondhead.next;
        }
        return true;
    }

    ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
    
}