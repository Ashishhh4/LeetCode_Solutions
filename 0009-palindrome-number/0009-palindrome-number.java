class Solution {
    public boolean isPalindrome(int x) {
        int reversed=0,original,remainder;
        original=x;
        if(original<0){
            return false;
        }
        while(x!=0){
            remainder=x%10;
            reversed=reversed*10+remainder;
            x/=10;
        }
        if(original==reversed){
            return true;
        }
        return false;
    }
}