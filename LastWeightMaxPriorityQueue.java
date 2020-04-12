class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(stones.length,new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					if(o1<o2)
						return 1;
					if(o1>o2)
						return -1;
					return 0;
				}
			});
        
        for(int i : stones){
        	pq.add(i);
        }
        
        while(pq.size()>1){
            
            int a = pq.poll();
            int b = pq.poll();
            
            int diff = a-b;
            
            pq.add(diff);
            
        }
        
        return pq.poll();
    }
}
