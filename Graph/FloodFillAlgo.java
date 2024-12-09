package Graph;
// start with start row(sr) and start coloum (sc)
// intialize the first row with new colour and traverse on that row in four side
public class FloodFillAlgo {
    private void dfs(int row, int col,
                     int[][] ans,
                     int[][] image,
                     int newColor, int delRow[], int delCol[],
                     int iniColor) {
        // color with new color
        ans[row][col] = newColor;
        int n = image.length;
        int m = image[0].length;
        // there are exactly 4 neighbours
        for(int i = 0;i<4;i++) {
            int nrow = row + delRow[i];
            int ncol = col + delCol[i];
            // check for valid coordinate
            // then check for same initial color and unvisited pixel
            if(nrow>=0 && nrow<n && ncol>=0 && ncol < m &&
                    image[nrow][ncol] == iniColor && ans[nrow][ncol] != newColor) {// if it colour is equal to intial color and visited row is not equal to new color
                // make sure to change only the colour that is same as inital it means 2 can change 2 only not one to 3
                dfs(nrow, ncol, ans, image, newColor, delRow, delCol, iniColor);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
        // get initial color
        int iniColor = image[sr][sc];
        int[][] ans = image;// create a copy of data dont temper the given data
        // delta row and delta column for neighbours
        int delRow[] = {-1, 0, +1, 0};
        int delCol[] = {0, +1, 0, -1};
        dfs(sr, sc, ans, image, newColor, delRow, delCol, iniColor);
        return ans;
    }
    public static void main(String[] args)
    {
        int[][] image =  {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        // sr = 1, sc = 1, newColor = 2
        FloodFillAlgo obj = new FloodFillAlgo();
        int[][] ans = obj.floodFill(image, 1, 1, 2);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[i].length; j++)
                System.out.print(ans[i][j] + " ");
            System.out.println();
        }
    }
}
