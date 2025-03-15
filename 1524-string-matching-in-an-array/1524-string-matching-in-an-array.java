class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> lst=new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j){
                    if(words[j].contains(words[i])){
                        lst.add(words[i]);
                        break;
                    }
                }
            }
        }
        return lst;
    }
}