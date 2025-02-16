class Solution {
    public int[] constructDistancedSequence(int n) {
      int len = n*2-1;
      int[] result = new int[len];
        boolean[] used = new boolean[n+1];
        
        for (int i=0;i<len;i++) {
            result[i]=-1;
        }
        
        backtrack(0,result,used,n);
        return result;
    }

    public boolean backtrack(int i,int[] result,boolean[] used,int n) {
        if (i>=result.length) {
            return true;
        }
        if (result[i]!=-1) {
            return backtrack(i+1,result,used,n);
        }

        for (int num=n;num>=1;num--) {
            if (used[num]) continue;

            int j = i + num;

            if (num == 1 || (j < result.length && result[j] == -1)) {
                result[i] = num;
                if (num > 1) result[j] = num; 
                used[num] = true;

                if (backtrack(i + 1, result, used, n)) {
                    return true;
                }

                result[i] = -1;
                if (num > 1) result[j] = -1;
                used[num] = false;
            }
        }
        return false;
    }
}