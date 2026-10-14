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
    ListNode mergeSort(ListNode a , ListNode b){
        ListNode start = new ListNode();
        ListNode temp = new ListNode();
        start = temp;
        while(a != null && b != null){
            if(a.val < b.val){
                temp.next = a;
                a = a.next;
                temp = temp.next;
            }else{
                temp.next = b;
                b = b.next;
                temp = temp.next;
            }
        }
        while(a != null){
            temp.next = a;
            a = a.next;
            temp = temp.next;
        }

        while(b != null){
            temp.next = b;
            b = b.next;
            temp = temp.next;
        }

        return start.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode mid = findMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeSort(left , right);

    }   
    
    ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode next = slow.next;
        slow.next = null;
        return next;
    }
}