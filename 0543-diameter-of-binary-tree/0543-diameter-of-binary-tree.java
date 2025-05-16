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
    int globalCombinedMax = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        dfs(root);
        return globalCombinedMax;
    }
    
    private int dfs(TreeNode root) {
        if (root == null) return 0;
        
        int left = dfs(root.left);
        int right = dfs(root.right);
        int localCombined = left + right;
        globalCombinedMax = Math.max(globalCombinedMax, localCombined); // complete left/right child, or join curr root.
        return Math.max(left , right) + 1; // pick single path + 1
    }
}