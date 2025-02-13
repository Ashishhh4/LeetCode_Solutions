class Solution {
    public int minOperations(int[] nums, int k) {
       int operations=0;
       PriorityQueue<Long> pq=new PriorityQueue<>();
       for(long num:nums){
        pq.add(num);
       }

       while(pq.size()>=2 && pq.peek()<k){
        operations++;
        Long n1=pq.poll();
        Long n2=pq.poll();
        Long sum=Math.min(n1,n2)*2+Math.max(n1,n2);
        pq.add(sum);
       }
       return operations;
    }
}