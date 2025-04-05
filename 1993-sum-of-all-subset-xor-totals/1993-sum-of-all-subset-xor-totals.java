class Solution {
    public int subsetXORSum(int[] nums) {
       return total(nums,0,0);
    }
    public int total(int nums[], int index,int xor){
        if(index==nums.length){
            return xor;
        }
        int pick=total(nums,index+1,xor^nums[index]);
        int nopick=total(nums,index+1,xor);
        return pick+nopick;
    } 
}