class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        int p1=m-1;
        int p2=n-1;
        int i=m+n-1;
        while(p2>=0){
            if(p1>=0 && A[p1]>B[p2]){
                A[i--]=A[p1--];
            }
            else{
                A[i--]=B[p2--];
            }
        }
    }
}