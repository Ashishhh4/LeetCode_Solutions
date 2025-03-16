class Solution {
    public long repairCars(int[] ranks, int cars) {
     long left=0;
     long right=1L*ranks[0]*cars*cars;
     while(left<right){
        long mid=(left+right)>>1;
        long count=0;
        for(int rank :ranks){
            count+=Math.sqrt(mid/rank);
        }
        if(count>=cars){
            right=mid;
        }
        else{
            left=mid+1;
        }
     }
     return(long) left;   
    }
}