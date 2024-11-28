package Graph;

import java.util.LinkedList;
import java.util.Queue;

//sc=o(n2)
// tc=
public class NumberOfIsland {
    // apply bfs
    private void bfs(int ro, int co, int[][] vis, char[][] grid) {
        vis[ro][co] = 1;
        // this will store pair put parameter first and second in constructor
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(ro, co));
        int n = grid.length;
        int m = grid[0].length;

        // until the queue becomes empty
        while(!q.isEmpty()) {
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();

// this is logic to decide the starting point
            // traverse in the neighbours and mark them if its a land
            // this traversal is going on all 8 direction (row,col) like (row-1, col +1), (row, col-1),( row-1, col-1), (row+1,col+1)
            for(int delrow = -1; delrow<=1;delrow++) {
                for(int delcol = -1; delcol <= 1; delcol++) {
                    int nrow = row + delrow;
                    int ncol = col + delcol;
                    // check if neighbour row and column is valid, and is an unvisited land
                    if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                            && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }
        }
    }

    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int cnt = 0;
        for(int row = 0; row < n ; row++) {
            for(int col = 0; col < m ;col++) {
                // if not visited and is a land than we need to apply bfs and make all
                if(vis[row][col] == 0 && grid[row][col] == '1') {
                    cnt++;
                    bfs(row, col, vis, grid);
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args)
    {
        char[][] grid =  {
                {'0', '1', '1', '1', '0', '0', '0'},
                {'0', '0', '1', '1', '0', '1', '0'}
        };

        NumberOfIsland obj = new NumberOfIsland();
        System.out.println(obj.numIslands(grid));
    }

}
