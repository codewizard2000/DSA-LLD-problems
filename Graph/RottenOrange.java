package Graph;

import java.util.LinkedList;
import java.util.Queue;

//minimum time is required so bfs use to level order traversal so it will be used
public class RottenOrange {

    // create 2d visited array
    // enqueue the rotten oranges where ever 2 is found
    // queue will store position of rootten oranges including time (2,0) ,0 example where (2,0) is position and 0 is time
    // deque the rootten orange find the fresh position of range make them rotten and add them in queue with position
    // visit each part using bfs traversal
    public static int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int count_fresh = 0;
        //Put the position of all rotten oranges in queue
        //count the number of fresh oranges
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                if(grid[i][j] == 2) {
                    // putting rotten oranges in queue
                    queue.offer(new int[]{i , j});
                }
                if(grid[i][j] != 0) {
                    count_fresh++;
                }
            }
        }

        if(count_fresh == 0) return 0;
        // countMinTime will count time
        // orangesEncountered will check oranges incpuntered
        int countMinTime = 0, orangesEncountered = 0;
        int dx[] = {0, 0, 1, -1};// up left right and down direction
        int dy[] = {1, -1, 0, 0};

        //bfs starting from initially rotten oranges
        while(!queue.isEmpty()) {
            int size = queue.size();
            orangesEncountered += size;
            for(int i = 0 ; i < size ; i++) {
                int[] point = queue.poll();
                for(int j = 0;j<4;j++) {// this loop iterates over all four direction
                    int x = point[0] + dx[j];// calculates the x co ordinates of neigbour oranges
                    int y = point[1] + dy[j];// calculates y co ordinates of neighbour oranges

                    if(x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 ||
                            grid[x][y] == 2) continue;// checks if oranges is out of bound and already rotten or emplty example (0)

                    grid[x][y] = 2;// marks it rotten
                    queue.offer(new int[]{x , y});// addes the new rotten oranges co-ordinates
                }
            }
            if(queue.size() != 0) {
                countMinTime++;// counts the time 
            }
        }
        return count_fresh == orangesEncountered ? countMinTime : -1;
    }
    public static void main(String args[])
    {
        int arr[][]={ {2,1,1} , {1,1,0} , {0,1,1} };
        int rotting = orangesRotting(arr);
        System.out.println("Minimum Number of Minutes Required "+rotting);
    }
}

