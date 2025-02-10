class Solution {
    public String clearDigits(String s) {
        Stack<Character> sk=new Stack<>();

        for(char c:s.toCharArray()){
            if(sk.size()>0 && c>='0' && c<='9'){
                sk.pop();
            }
            else{
                sk.push(c);
            }
        }
        String s1="";
        for(char c:sk){
            s1+=c;
        }
        return s1;
    }
}