class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        StringBuilder b=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=(nums[i].charAt(i)=='0'?'1':'0');
            b.append(ch);
        }
        return b.toString();
    }
}