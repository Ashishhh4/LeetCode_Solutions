class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int cand =0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count==0){
                cand=nums[i];
            }
            if(cand==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return cand;
    }
}