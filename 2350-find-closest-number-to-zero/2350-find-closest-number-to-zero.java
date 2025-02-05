class Solution {
    public int findClosestNumber(int[] nums) {
        int c=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            if(Math.abs(num)<Math.abs(c)){
                c=num;
            }
            else if(Math.abs(num)==Math.abs(c) && num>c){
                c=num;
            }
        }
        return c;
    }
}