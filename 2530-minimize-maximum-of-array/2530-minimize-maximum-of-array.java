class Solution {
    public int minimizeArrayValue(int[] nums) {
        long sum=0;
        long a=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            a=Math.max(a,(sum+i)/(i+1));
        }
        return (int) a;
    }
}