class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> groupanagrams =new HashMap<>();
        for(String str:strs){
            char [] intchar=str.toCharArray();
            Arrays.sort(intchar);
            String sortedarr=String.valueOf(intchar);
            if(!groupanagrams.containsKey(sortedarr)){
                groupanagrams.put(sortedarr,new ArrayList<>());
            }
            groupanagrams.get(sortedarr).add(str);
        }
        return new ArrayList<>(groupanagrams.values());
    }
}