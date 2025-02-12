class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> f=new HashMap<>();
        int res=-1;
        for(int num:nums){
            int key=sumofdigit(num);
            if(f.containsKey(key)){
                res=Math.max(res,f.get(key)+num);
                f.put(key,Math.max(f.get(key),num));
            }else{
                f.put(key,num);
            }
        }
            return res;
    }
     int sumofdigit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
     }
}