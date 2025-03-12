class Solution {
    public int maximumCount(int[] nums) {
        int end=nums.length;
        int n=end-1;
        int negpos=binary_search(nums,0,n,-1);
        int pospo=binary_search(nums,negpos,n,0);
        int poscount=(end-pospo);
        return Math.max(negpos,poscount);
    }
     public int binary_search(int nums[],int first,int last,int target){
        while(first<=last){
            int mid=last+(first-last)/2;
            if(nums[mid]<=target){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return first;
    }
}