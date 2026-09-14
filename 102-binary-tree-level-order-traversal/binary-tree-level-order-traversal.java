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
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        ans.add(new ArrayList<>(Arrays.asList(root.val)));

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root.left);
        queue.add(root.right);

  

        while(!queue.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode t = queue.poll();
                if(t != null && t.left != null){
                    queue.add(t.left);
                }
                if(t != null && t.right != null){
                    queue.add(t.right);
                }
                if(t != null){
                    temp.add(t.val);
                }
                
            }
            if(!temp.isEmpty()){
                 ans.add(temp);
            }
           
        }
        return ans;
    }
}