class Solution {
    public int longestPalindrome(String s) {
        int arr[]=new int [128];
        for(char ch:s.toCharArray()){
            arr[ch]++;
        }
        int res=0;
        for(int i=0;i<128;i++){
            int val=arr[i];
            res=res+(val/2)*2;
            if(res%2==0 && val%2==1){
                res++;
            }
        }
        return res;
    }
}