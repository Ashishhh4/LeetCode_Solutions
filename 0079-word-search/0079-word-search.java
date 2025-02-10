class Solution {
    public boolean exist(char[][] board, int i,int j ,char[] word_arr,int idx){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]=='*'|| board[i][j]!=word_arr[idx] ){
            return false;
        }
        if(idx==word_arr.length-1){
            return true;
        }
        char ch=board[i][j];
        board[i][j]='*';
        boolean res=exist(board,i+1,j,word_arr,idx+1)||
        exist(board,i-1,j,word_arr,idx+1)||
        exist(board,i,j+1,word_arr,idx+1)||
        exist(board,i,j-1,word_arr,idx+1);
        board[i][j]=ch;
        return res;
    }
    public boolean exist(char[][] board, String word) {
        char[] word_arr=word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word_arr[0] && exist(board,i,j,word_arr,0)){
                    return true;
                }
            }
        }
    return false;
    }
}