class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr1[i]);
        }
        int countarr[]=new int[max+1];
        for(int i=0;i<n;i++){
            int element=arr1[i];
            countarr[element]++;
        }
        int j=0;
        int r[]=new int[n];
        for(int i=0;i<m;i++){
            int element=arr2[i];
            while(countarr[element]>0){
                r[j]=element;
                j++;
                countarr[element]--;
            }
        }
        for(int i=0;i<max+1;i++){
            while(countarr[i]>0){
                r[j]=i;
                j++;
                countarr[i]--;
            }
        }
        return r;
    }
}