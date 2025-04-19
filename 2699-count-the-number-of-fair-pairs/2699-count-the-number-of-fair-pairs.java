class Solution {
public long countatMost(int[] nums, int target) {
        long cnt = 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] <= target) {
                cnt += (j - i);
                i++;
            } else {
                j--;
            }
        }
        return cnt;
    }

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countatMost(nums, upper) - countatMost(nums, lower - 1);
    }
}