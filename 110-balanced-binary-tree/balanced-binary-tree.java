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
    
    public boolean isBalanced(TreeNode root) {
        int k = figureItOut(root);
        if(k == -1){
            return false;
        }
        return true;
    }

    public int figureItOut(TreeNode root){
        if(root == null){
            return 0;
        }

       int leftHeight =  figureItOut(root.left);
        if(leftHeight == -1){
            return -1;
        }
        
        
        
        int rightHeight = figureItOut(root.right);
        if(rightHeight == -1){
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        
        return 1 + Math.max(leftHeight , rightHeight);
    }
}