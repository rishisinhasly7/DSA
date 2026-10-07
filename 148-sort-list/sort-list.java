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
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = findMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeSort(left , right);

    }
    public ListNode mergeSort(ListNode a , ListNode b){
        if(a == null && b == null){
            return null;
        }
        ListNode dummy = new ListNode();
        ListNode head = null;
        while(a != null && b != null){
            if(a.val < b.val){
                dummy.next = a;
                a = a.next;
                dummy = dummy.next;
            }else{
                dummy.next = b;
                b = b.next;
                dummy = dummy.next;
            }

            if(head == null){
                head = dummy;
            }
        }
        while(a != null){
            dummy.next = a;
            a = a.next;
            dummy = dummy.next;
            if(head == null){
                head = dummy;
            }
        }

        while(b != null){
            dummy.next = b;
            b = b.next;
            dummy = dummy.next;
            if(head == null){
                head = dummy;
            }
        }
        return head;
    }

    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode k = slow.next;
        slow.next = null;
        return k;
    } 
}