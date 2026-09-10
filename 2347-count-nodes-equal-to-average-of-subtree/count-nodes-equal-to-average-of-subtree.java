class Solution {
    int answerCount = 0;

    public int averageOfSubtree(TreeNode root) {
        postOrder(root);
        return answerCount;
    }

    private int[] postOrder(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }
        int[] left = postOrder(node.left);
        int[] right = postOrder(node.right);

        int sum = left[0] + right[0] + node.val;
        int count = left[1] + right[1] + 1;

        if (sum / count == node.val) {
            answerCount++;
        }

        return new int[]{sum, count};
    }
}