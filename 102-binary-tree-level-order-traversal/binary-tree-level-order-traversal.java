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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null ){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new  LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        queue.add(root.left);
        queue.add(root.right);
        ans.add(new ArrayList<>(Arrays.asList(root.val)));

        while(!queue.isEmpty()){
            List<Integer> result = new ArrayList<>();
            int size = queue.size();
            for(int i =0;i<size;i++){
                TreeNode temp = queue.poll();
                if(temp != null &&temp.left != null ){
                    queue.add(temp.left);
                }
                if(temp != null && temp.right != null ){
                    queue.add(temp.right);
                }
                if(temp != null){
                    result.add(temp.val);
                }
                
            }
            if(!result.isEmpty()){
                ans.add(result);
            }
            
        }
        return ans;
    }
}