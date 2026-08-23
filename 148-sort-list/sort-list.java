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

        return merge(left , right);

    }

    public ListNode merge(ListNode list1 , ListNode list2){
        ListNode head1 = list1;
        ListNode head2 = list2;
        ListNode node = new ListNode();
        ListNode temp = node;

        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }        
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return node.next;
    }

    public ListNode findMid(ListNode head){
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        length /= 2;
        temp = head;
        if(length == 0){}
        for(int i=0;i<length-1;i++){
            temp = temp.next;
        }
        ListNode mid = temp.next;
        temp.next = null;
        return mid;
    }
} 