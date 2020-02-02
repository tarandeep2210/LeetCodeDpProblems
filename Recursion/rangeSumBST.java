// https://leetcode.com/problems/range-sum-of-bst/submissions/

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
    
     static int sum;
    public int rangeSumBST(TreeNode root, int L, int R) {
        sum=0;
        helper(root,L,R);
        
        return sum;
        
//         if(root.val<=R && root.val>=L)
//             return root.val+ rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R);
        
//         return rangeSumBST(root.left,L,R) + rangeSumBST(root.right,L,R);
        
    }   
    
    public static void helper(TreeNode root , int L , int R ){
        if(root==null) return ;
        
        if(root.val<=R && root.val>=L)
            sum+=root.val;
        if(L<root.val)    
            helper(root.left,L,R);
        if(R>root.val)
            helper(root.right,L,R);
        
        return;
    
    }
}

