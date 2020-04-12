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
	
	  public int lastStoneWeight(int[] stones) {
        if(stones == null || stones.length == 0){
            return 0;
        }
        
        Comparator<Integer> comparator = (o1, o2) -> o2-o1;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(comparator);
        for(int stone : stones){
            queue.offer(stone);
        }
        
        while(queue.size() > 1){
            int num1 = queue.poll();
            int num2 = queue.poll();
            if(num1!= num2){
                queue.offer(num1-num2);
            }
        }
        
        return queue.isEmpty()?0: queue.poll();
    }
}
