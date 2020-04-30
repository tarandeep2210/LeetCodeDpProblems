package Leetcode;

public class BinaryTreeMaxSumPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	class Solution {
	     int sum= Integer.MIN_VALUE;
	    
	    
	    public int maxPathSum(TreeNode root) {
	    
	        maxPathSumUtil(root);
	        
	        return sum;
	        
	    }
	    
	    public int maxPathSumUtil(TreeNode root){
	        
	        //Base Case
	        
	        if(root==null)  return 0;
	        
	        int left = maxPathSumUtil(root.left);
	        int right = maxPathSumUtil(root.right);
	        
	        int max_single_Path = Math.max(Math.max(left, right)+root.val,root.val);
	        
	        int maxTop = Math.max(max_single_Path , left+right+root.val);
	        
	        sum = Math.max(sum,maxTop);
	        
	        return max_single_Path;
	    }
	}

}
