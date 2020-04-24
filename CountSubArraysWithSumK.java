package Leetcode;

public class CountSubArraysWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//O(n2) tc and O(1) sc
	
	  public int subarraySum(int[] nums, int k) {
	        int count = 0;
	        for (int start = 0; start < nums.length; start++) {
	            int sum=0;
	            for (int end = start; end < nums.length; end++) {
	                sum+=nums[end];
	                if (sum == k)
	                    count++;
	            }
	        }
	        return count;
	    }
	  
	  //O(n) Tc O(n) sc
	  
//	    public int subarraySum(int[] nums, int k) {
//	        int count = 0;
//	        for (int start = 0; start < nums.length; start++) {
//	            for (int end = start + 1; end <= nums.length; end++) {
//	                int sum = 0;
//	                for (int i = start; i < end; i++)
//	                    sum += nums[i];
//	                if (sum == k)
//	                    count++;
//	            }
//	        }
//	        return count;
//	    }

}
