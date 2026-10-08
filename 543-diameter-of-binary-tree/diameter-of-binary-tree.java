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
    int k = 0 ;
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return k - 2;
    }

    public int findDiameter(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = 1 + findDiameter(node.left);
        int right = 1 + findDiameter(node.right);
        k = Math.max(k , left+right);

        return Math.max(left , right);
    }
}