import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftans=Math.max(dfs(root.left),0);
        int rightans=Math.max(dfs(root.right),0);

        max=Math.max(max, root.val+left+right);
        return root.val+Math.max(left, right);
        

    }
}