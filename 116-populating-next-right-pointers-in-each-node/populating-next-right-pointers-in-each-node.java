/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {    
     Node t = new Node();
    public Node connect(Node root) {
        if(root == null){
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
   
        queue.offer(root);

        while(!queue.isEmpty()){
        int size = queue.size();
        Node temp = null;
        Node border = null;

        for(int i=0;i<size;i++){
     
        temp = queue.poll();

        if(temp != null && temp.left != null){
            queue.offer(temp.left);
            if(border != null){
                border.next = temp.left;
            }
            temp.left.next = temp.right;
        }

        if(temp != null && temp.right != null){
            queue.offer(temp.right);
            border = temp.right;
            }
        }
           temp.next = null;
        }
        return root;
        
    }
}