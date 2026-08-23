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
        if(head == null){
            return null;
        }
   
   ListNode temp = head;
    ListNode prev = null;
    ListNode Next = head.next;

   while(temp != null){
        temp.next = prev;
        prev = temp;
        temp = Next;
        if(Next != null){
Next = Next.next;
        }
     }
    return prev;

    }
}