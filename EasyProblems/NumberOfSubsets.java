package DynamicProgramming;

import java.util.HashMap;

public class NumberOfSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find Number Of Subsets that sum upto a given target k
		
		int arr[] = { 2 , 4 ,6 ,10 };
		int k =16 ;
		
		int n = countNumberOfSubsets_DP(arr,k);
		
		System.out.println("Number of subsets:" + n);
		
	}
	
	
	//Recursive Solution
	
	public static int countNumberOfSubsets(int[] arr , int k){
		return rec(arr , k ,arr.length-1);
	}
	
	static int rec(int arr[] , int k , int i){
		if (k == 0){
			return 1;
		}
		else if (k<0)
			return 0;
		else if(i<0)
			return 0;
		else if (k < arr[i])
			return rec(arr , k ,i-1);
		else
			return rec(arr,k-arr[i],i-1) + rec(arr , k ,i-1);
				
	}
	
	//DP Memoization Solution
	
	public static int countNumberOfSubsets_DP(int[] arr , int k){
		HashMap<String ,Integer> mem = new HashMap<String ,Integer>();
		return dp(arr , k ,arr.length-1,mem);
	}
	
	public static int dp(int[] arr , int k ,int i , HashMap<String ,Integer> mem){
		String key = k+":"+i;
		int to_return;
		
		if(mem.containsKey(key)){
			return mem.get(key);
		}
		if (k == 0){
			return 1;
		}
		else if (k<0)
			return 0;
		else if(i<0)
			return 0;
		else if (k < arr[i])
			 to_return = dp(arr , k ,i-1,mem);
		else
			 to_return = dp(arr,k-arr[i],i-1,mem) + dp(arr , k ,i-1,mem);
		mem.put(key, to_return);
		return to_return;	
	}
}
