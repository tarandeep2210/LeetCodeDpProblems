// https://leetcode.com/problems/minimum-distance-between-bst-nodes/submissions/


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
     int minVal;
    int lastSeen = Integer.MIN_VALUE;
    public int minDiffInBST(TreeNode root) {
        
        minVal=Integer.MAX_VALUE;
        
        if(root==null) return -1;
        
        helper(root);
        
        return minVal;
        
    }
    public void helper(TreeNode root){
        if(root==null) return;
        
           helper(root.left);
        
          if(lastSeen != Integer.MIN_VALUE){
                minVal = Math.min(minVal, Math.abs(root.val - lastSeen));
                lastSeen = root.val;
            }else{
                lastSeen = root.val;
          }
        
     
        helper(root.right);
              
              return;
    }
}
