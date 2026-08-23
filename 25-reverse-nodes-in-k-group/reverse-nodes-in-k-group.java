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
    public int findLength(ListNode temp){
        ListNode dummy = temp;
        int count = 0;
        while(dummy != null){
            dummy = dummy.next;
            count++;
        }
        return count;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if( k <= 1 || head == null){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        int length = findLength(head);
        while(true){
            ListNode newEnd = curr;
            ListNode last = prev;

            ListNode next = curr.next;
           
            if(length >= k){
                 length = length - k;
                 for(int i=0;i < k && curr != null;i++){
                curr.next = prev;
                prev = curr;
                curr = next;
                if(next != null){
                    next = next.next;
                }
            } 

            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }
            newEnd.next = curr;

            if(curr == null){
                break;
            }
            prev = newEnd;
            }else{
                break;
            }
           
        }
        return head;
    }
}   