class Solution {
    public String smallestNumber(String pattern) {
        int n=pattern.length()+1;
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        
        int i = 0;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == 'D') {
                int j = i;
                while (j < pattern.length() && pattern.charAt(j) == 'D') {
                    j++;
                }
                reverse(arr, i, j);
                i = j;  
            } else {
                i++;
            }
        }
       StringBuilder b=new StringBuilder();
       for(int num:arr){
        b.append(num);
       }
       return b.toString();
    }


    private void reverse(int arr[],int left,int right){
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }

}