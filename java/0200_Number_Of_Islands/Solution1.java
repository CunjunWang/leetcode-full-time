class Solution1 {
    char[][] grid;
    boolean[][] visited;
    int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    int R;
    int C;
    
    /*
     * Recursively DFS.
     *
     * Time Complexity: O(MN)
     * Space Complexity: O(MN)
     */
    public int numIslands(char[][] grid) {
        if (grid == null)
            return 0;
        
        R = grid.length;
        if (R == 0)
            return 0;
        C = grid[0].length;
        if (C == 0)
            return 0;
        
        this.grid = grid;
        this.visited = new boolean[R][C];
        
        int res = 0;
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++) 
                if (grid[i][j] == '1' && !visited[i][j]) {
                    res++;
                    dfs(i,j);
                }
        
        return res;
    }
    
    private void dfs(int i, int j) {
        visited[i][j] = true;
        for (int d = 0; d < 4; d++) {
            int nextI = i + dir[d][0];
            int nextJ = j + dir[d][1];
            if (inArea(nextI, nextJ) && grid[nextI][nextJ] == '1' && !visited[nextI][nextJ])
                dfs(nextI, nextJ);
        }
    }
    
    private boolean inArea(int i, int j) {
        return i >= 0 && i < R && j >= 0 && j < C;
    }
}