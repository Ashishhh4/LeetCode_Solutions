class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
        int totalmatches=0;
        while(n>1){
            matches=n/2;
            totalmatches+=matches;
            n-=matches;
        }
        return totalmatches;
    }
}