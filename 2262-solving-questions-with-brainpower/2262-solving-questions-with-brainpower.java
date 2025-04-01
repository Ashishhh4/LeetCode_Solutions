class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        
        if (n == 1)
            return questions[0][0];
        
        long[] t = new long[200001];
        
        for (int i = n - 1; i >= 0; i--) {
            int nextQuestionIndex = i + questions[i][1] + 1;
            long pointsIfTaken = questions[i][0] + (nextQuestionIndex < 200001 ? t[nextQuestionIndex] : 0);
            t[i] = Math.max(pointsIfTaken, t[i + 1]);
        }
        
        return t[0];
    }
}