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
        List<List<Integer>> result = new ArrayList<>();
      
        if (root == null) {
            return result;
        }
      
        Deque<TreeNode> queue = new ArrayDeque<>();
      
        queue.offer(root);
      
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
          
            int levelLength = queue.size();
            for (int i = 0; i < levelLength; ++i) {
                TreeNode currentNode = queue.poll();
              
                level.add(currentNode.val);
              
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
              
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
          
            result.add(level);
        }
      
        return result;
    }
}
