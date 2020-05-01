package Leetcode;

//Find Length of Longest Common SUbsequence using Dp

public class LongestCommonSubSeqLen {
	    
	    class Pair{
	        int x,y;
	        public Pair(int x , int y){
	            this.x=x;
	            this.y=y;
	        }
	    }
	    
	    String txt1,txt2;
	    HashMap<Pair,Integer> map = new HashMap<Pair,Integer>();
	    
	    public int longestCommonSubsequence(String text1, String text2) {
	        
	        txt1 = text1;
	        txt2 = text2;
	        
	        return myLCS(text1.length(),text2.length());
	    }
	    
	    public int myLCS(int len1 , int len2){
	        

	        if(len1==0 || len2==0){
	            return 0;
	        }
	        
	        Pair p = new Pair(len1,len2);
	        
	        if(map.containsKey(p)) return map.get(p);    
	        
	        if(txt1.charAt(len1-1)==txt2.charAt(len2-1)){
	            int val = 1 + myLCS(len1-1,len2-1);
	            map.put(p,val);
	            return map.get(p);        
	        }
	        int val2 = Math.max(myLCS(len1,len2-1),myLCS(len1-1,len2));
	        map.put(p, val2);
	       return map.get(p); 
	        
	    }
	    
	    //Best Soltuoin
	    public int iterativeDP(String t1, String t2){
	        
	        int n = t1.length();
	        int m = t2.length();
	        int[][] dp = new int[n+1][m+1];
	        dp[0][0] = 0;       //Base Case
	        
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	                if(t1.charAt(i)==t2.charAt(j)){
	                    dp[i+1][j+1] = 1+dp[i][j];
	                }
	                else{
	                    dp[i+1][j+1] = Math.max(dp[i][j+1],dp[i+1][j]);
	                }
	            }
	        }
	        
	        return dp[n][m];
	        
	    }
	
}
