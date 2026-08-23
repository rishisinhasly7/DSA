/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode slow = head ;
        ListNode fast = head;
        ListNode Fcurr = head;
        ListNode Scurr = head;

        int length = 0;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                length = lengthOfCycle(slow);
                break;
            }
        }
        if(length == 0){
            return null;
        }

        for(int i=0;i<length;i++){
            Fcurr = Fcurr.next;
        }

        while(Fcurr != Scurr){
            Fcurr = Fcurr.next;
            Scurr = Scurr.next;
        }
        return Fcurr;
    }

    public int lengthOfCycle(ListNode head){
        ListNode temp = head;
        int count = 0;

        do{
            temp = temp.next;
            count++;
        }while(temp != head);

        return count;
    }
}