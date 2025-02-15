class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] arr=s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character,String> hm=new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            boolean ck=hm.containsKey(c);
            if(hm.containsValue(arr[i]) && !ck){
                return false;
            }
            if(ck && !hm.get(c).equals(arr[i])){
                return false;
            }
            else{
                hm.put(c,arr[i]);
            }
        }
        return true;
    }
}