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
        ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head){
        ListNode dummy = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = dummy;
            dummy = curr;
            curr = temp;
        }     
        return dummy;

    }

    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode mid = findMid(head);
        ListNode secondHead = reverseList(mid);
        ListNode firstHead = head;
        ListNode repeatHead = secondHead;

        while(secondHead != null && firstHead != null){
            if(secondHead.val != firstHead.val){
                return false;
            }
            secondHead = secondHead.next;
            firstHead = firstHead.next;
        }
            // reverseList(repeatHead);
           return true;
    }
   
}