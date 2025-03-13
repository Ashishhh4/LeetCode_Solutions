class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
         int n = nums.length;
        int m = queries.length;
        int[] prefix = new int[n + 1];
        int current = 0;
        int idx = 0;
        for (int i = 0; i < n; i++){
            current += prefix[i];
            while (idx < m && current < nums[i]){
                int left = queries[idx][0];
                int right = queries[idx][1];
                int val = queries[idx][2];
                idx++;
                if (i < left){
                    prefix[left] += val;
                } else if (i <= right){
                    current += val;
                }
                prefix[right + 1] -= val;
            }
            if (current < nums[i]){
                return -1;
            }
        }
        return idx;
    }
}