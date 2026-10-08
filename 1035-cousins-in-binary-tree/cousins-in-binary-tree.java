/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root , int x , int y){
        TreeNode xx = findNode(root , x);
        TreeNode yy = findNode(root , y);

        return (
        (level(root , xx , 0) == level(root , yy , 0) && (!isSibling(root , xx , yy)))
        );
    }

    TreeNode findNode(TreeNode root , int x){
        if(root == null){
            return root;
        }
        if(root.val == x){
            return root;
        }
        TreeNode n = findNode(root.left, x);
        if(n != null){
            return n;
        }
        return findNode(root.right, x);
    }

    boolean isSibling(TreeNode root , TreeNode x , TreeNode y){
        if(root == null){
            return false;
        }

        return (
            (root.left == x && root.right == y) ||  (root.left == y && root.right == x) || isSibling(root.left,x ,y) || isSibling(root.right , x , y)
        );
    }

    int level(TreeNode root , TreeNode x , int level){
        if(root == null){
            return 0;
        }
        if(root == x){
            return level;
        }
        int l = level(root.left , x , level+1);
        if(l != 0){
            return l;
        }
        return level(root.right , x , level+1);
    }

}