class Solution {
    public int climbStairs(int n) {
        if(n<3){
            return n;
        }
        int m=1;
        int m2=2;
        int count=0;
        for(int i=2;i<n;i++){
            count=m+m2;
            m=m2;
            m2=count;
        }
    return count;
    }
}