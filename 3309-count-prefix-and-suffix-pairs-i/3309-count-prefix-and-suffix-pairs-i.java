class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int res=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                String w1=words[i];
                String w2=words[j];
                if(w2.startsWith(w1) && w2.endsWith(w1)){
                    res+=1;
                }
            }
        }
        return res;
    }
}