class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left=0;
        int maxlength=0;
        int bits=0;
        for(int i=0;i<nums.length;i++){
            while((bits & nums[i])!=0){
                bits^=nums[left];
                left++;
            }
            bits|=nums[i];
            maxlength=Math.max(maxlength,i-left+1);
        }
        return maxlength;
    }
}