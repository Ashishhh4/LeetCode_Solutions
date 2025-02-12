class Solution {
    public boolean isValid(String s) {
        Stack<Character> a=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' ||ch=='['){
                a.push(ch);
            }
            else{
                if(a.isEmpty()){
                    return false;
                }
                char top=a.pop();
                if((ch=='}' && top!='{')||
                (ch==')' && top!='(')||(ch==']' && top!='[')){
                    return false;
                }
            }
        }
        return a.isEmpty();
    }
}