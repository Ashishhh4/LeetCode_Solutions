class Solution {
    int build(int []freq){
        int w=0;
        for(int i=0;i<26;++i){
            if(freq[i]>0){
                freq[i]--;
                w+=1+build(freq);
                freq[i]++;
            }    
        }
        return w;
    }
    public int numTilePossibilities(String tiles) {
       int [] freq=new int[26];
        for(char c:tiles.toCharArray()){
            freq[c-'A']++;
        }
        return build(freq);
    }
}