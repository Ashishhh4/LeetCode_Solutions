class Solution {
     static boolean isSafe(char[][] grid, int r, int c, boolean[][] visited) {
        int row = grid.length;
        int col = grid[0].length;

        // r is in range, c is in range, value 
        // is 1 and not yet visited
        return (r >= 0) && (r < row) && (c >= 0) && 
               (c < col) && (grid[r][c] == '1' && !visited[r][c]);
    }

    static void dfs(char[][] grid, int r, int c, boolean[][] visited) {
        int[] rNbr = { -1, 1, 0, 0 }; // Only Up, Down, Left, Right
        int[] cNbr = { 0, 0, -1, 1 };
        visited[r][c] = true;
        for (int k = 0; k < 4; ++k) {
            int newR = r + rNbr[k];
            int newC = c + cNbr[k];
            if (isSafe(grid, newR, newC, visited)) {
                dfs(grid, newR, newC, visited);
            }
        }
    }

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        int count = 0;
        for (int r = 0; r < row; ++r) {
            for (int c = 0; c < col; ++c) {
                if (grid[r][c] == '1' && !visited[r][c]) {
                    
                    dfs(grid, r, c, visited);
                    
                    ++count;
                }
            }
        }
        return count;
    }
}