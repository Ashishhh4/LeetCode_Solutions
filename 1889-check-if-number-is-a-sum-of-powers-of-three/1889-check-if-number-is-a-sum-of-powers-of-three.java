class Solution {
    public boolean checkPowersOfThree(int n) {
        int a = n;
        while(a > 0){
            int r = a % 3;
            System.out.println(r);
            if(r > 1) 
            {
                return false;
            }
            a = a / 3;
            
        }
        return true;
    }
}