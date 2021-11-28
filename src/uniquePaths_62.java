public class uniquePaths_62 {
    public static void main(String[] args){

    }
}

//m1
//from top to down
/*


//m2
//from bottom to up
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(i==m-1 || j==n-1){
                    grid[i][j] = 1;//右下角的左边格子和上边格子开始
                }
                else{
                    grid[i][j] = grid[i+1][j] + grid[i][j+1];
                }
            }
        }
        return grid[0][0];
    }
}
 */