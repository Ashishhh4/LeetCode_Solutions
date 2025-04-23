class Solution {
    public int countLargestGroup(int n) {
        int arr[]=new int[n+1];

        for(int i=1;i<=n;i++){
            int sum=0;
            int x=i;
            while(x>0){
                sum+=x%10;
                x/=10;
            }
            arr[sum]++;
        }
        int max=0;
        int c=0;
        for(int i=0;i<=n;i++){
            if(arr[i]==0){
                continue;
            }
            if(arr[i]==max){
                c++;
            }
            else if(arr[i]>max){
                max=arr[i];
                c=1;
            }
            
        }
        return c;
    }
}