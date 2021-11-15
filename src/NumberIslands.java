public class NumberIslands {
    static int[][] cross = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public static void main(String[] args) {
            char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
            int res = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == '1') {
                        res++;
                        dfs(grid, i, j);
                    }
                }
            }

            System.out.println(res);
        }

        private static void dfs(char[][] grid, int i, int j){
            grid[i][j] = '0';//相当于染色,妙
            for(int[] c:cross){
                int x = i + c[0];
                int y = j + c[1];
                if(x<0 || y<0 || x>=grid.length || y>=grid[x].length || grid[x][y] == '0'){
                    continue;
                }
                dfs(grid,x,y);
            }
        }
}
