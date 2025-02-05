class Solution {
    public int firstMissingPositive(int[] nums) {
        int missno=1;
        Arrays.sort(nums);
        for(int number:nums){
            if(number>0){
                if(number==missno){
                    missno++;
                }
                else if(number>missno){
                    break;
                }
            }
        }
        return missno;
    }
}