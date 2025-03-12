class Solution {
    public int maximumCount(int[] nums) {
        int ans=0;
        int n=nums.length;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                count1++;
            }
            else if(nums[i]>0){
                count2++;
            }
        }
        if(count1<count2){
            ans=count2;
        }
        else{
            ans=count1;
        }
        return ans;
    }
}