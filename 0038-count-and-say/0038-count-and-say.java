class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String temp = countAndSay(n-1);
         StringBuilder ans = new StringBuilder();
        for(int i=0;i<temp.length();i++){
             int count = 1;
            char ch = temp.charAt(i);
            while(i<temp.length()-1 && temp.charAt(i+1)==ch){
                count++;
                i++;
            }
            ans.append(count).append(ch);
        }
        return ans.toString();
    }
}