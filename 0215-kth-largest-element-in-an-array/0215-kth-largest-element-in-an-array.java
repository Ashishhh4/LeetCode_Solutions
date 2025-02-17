import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Create a min-heap of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        
        // Iterate over the array
        for (int num : nums) {
            // Add current number to the heap
            minHeap.offer(num);
            // If the heap exceeds size k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        // The root of the heap is the k-th largest element
        return minHeap.peek();
    }
}
