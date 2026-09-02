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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp=  head;
        int length = 0;

         while(temp != null){
             length++;
             temp = temp.next;
        }
        int times_of_rotation= k % length;
        
        for(int i = 0;i < times_of_rotation;i++){
        ListNode front = head;
        ListNode tail = head;
        ListNode prev = null;
            
        while(tail.next != null){
             prev = tail;
            tail = tail.next;
        }
            tail.next = front;
            prev.next = null;
            head = tail;

        }
        return head;
    }
}