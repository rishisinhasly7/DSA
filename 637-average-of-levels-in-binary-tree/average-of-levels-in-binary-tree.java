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
    public List<Double> averageOfLevels(TreeNode root) {
         List<Double> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        ans.add((double)(root.val));
        double num = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        if(root.left != null){queue.add(root.left);}
        
        if(root.right != null){queue.add(root.right);}

        while(!queue.isEmpty()){

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
                     num += t.val;
                }
            } // for loop exit
            System.out.println(num);
                ans.add((num / size)); 
             
           num = 0;
        }
        return ans;
    }
}