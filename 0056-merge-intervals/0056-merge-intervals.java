class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(arr1,arr2)->arr1[0]-arr2[0]);
        List<int []> output=new ArrayList<>();
        int[] current=intervals[0];
        output.add(current);

        for(int[] interval:intervals){
            int c=current[1];
            int begin=interval[0];
            int end=interval[1];
            if(c>=begin){
            current[1]=Math.max(c,end);
            }else{
                current=interval;
                output.add(current);
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}