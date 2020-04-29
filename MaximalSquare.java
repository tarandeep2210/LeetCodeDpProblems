package Leetcode;

public class MaximalSquare {

//DP SOlution to calculate are of the largest square of ones. We are considering bottomost square
	    public int maximalSquare(char[][] matrix) {
	        
	        int H = matrix.length;
	       
	        
	        if(H==0 || matrix[0].length==0){
	            return 0;
	        }
	        int W = matrix[0].length;
	        int ans=0;
	        int dp[][] = new int[H][W];
	        
	        for(int i=0;i<H;i++){
	            for(int j=0;j<W;j++){
	                if(matrix[i][j]=='1'){
	                    dp[i][j]=1;
	                    if(i>0 && j>0)
	                        dp[i][j] += Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
	                    ans=Math.max(dp[i][j],ans);
	                }
	            }
	        }
	        
	        return ans*ans;    
	        
	    }


}
