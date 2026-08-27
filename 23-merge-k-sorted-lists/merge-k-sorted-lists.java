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
    public ListNode merge(ListNode node1 , ListNode node2){
        ListNode h1 = node1;
        ListNode h2 = node2;
        ListNode node = new ListNode();
        ListNode temp = node;

        while(h1 != null && h2 != null){
            if(h1.val < h2.val){
                temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
            }else{
                temp.next = h2;
                h2 = h2.next;
                temp = temp.next;
            }
        }

        while(h1 != null){
            temp.next = h1;
                h1 = h1.next;
                temp = temp.next;
        }
        while(h2 != null){
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }

        return node.next;

    }
    public ListNode mergeKLists(ListNode[] lists) {

        if(lists.length < 1){
            return null;
        }
         if(lists.length == 1){
            return lists[0];
        }

        ListNode temp = merge(lists[0] , lists[1]);

        for(int i=2;i<lists.length;i++){
            temp = merge(temp , lists[i]);
        }
        return temp;
        
    }
}