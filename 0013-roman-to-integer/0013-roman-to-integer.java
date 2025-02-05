class Solution {
    int value(char r){
        if(r=='I'){
            return 1;
        }
        else if(r=='V'){
            return 5;
        }
        else if(r=='X'){
            return 10;
        }
        else if(r=='L'){
            return 50;
        }
        else if(r=='C'){
            return 100;
        }
        else if(r=='D'){
            return 500;
        }
        else if(r=='M'){
            return 1000;
        }
        return 1;
    }
    public int romanToInt(String s) {
        int n=s.length();
        int total=0;
        for(int i=0;i<n;i++){
            int s1=value(s.charAt(i));
           if(i+1<n){
            int s2=value(s.charAt(i+1));
            if(s1>=s2){
                total+=s1;
            }
            else{
                total-=s1;
            }
           }
           else{
            total+=s1;
           }
        }
        return total;
    }
}