public class DPFallingPathSum {
    public static void main(String[] args){
        int[][] matrix = {{-80,-13,22}, {83,94,-5}, {73,-48,61}};
        int n = matrix.length;
        /*
        int[][] temp = new int[n][n];
        for(int i=0; i<n; i++){
            matrix[0][i] = matrix[0][i];//第一行照搬
        }
         */
        for(int i=1; i<n; i++){//剩下从第二行开始算
            for(int j=0; j<n; j++){
                if(j == 0){
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j],matrix[i-1][j+1]);
                }
                else if(j == n-1){
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j],matrix[i-1][j-1]);
                }
                else{
                    //两层 min 嵌套解决三数 min 情况
                    matrix[i][j] = matrix[i][j] + Math.min(Math.min(matrix[i-1][j-1],matrix[i-1][j]),matrix[i-1][j+1]);
                }
            }
        }
        int res = matrix[n-1][0];
        for(int i=0; i<n; i++){
            if(res > matrix[n-1][i]){
                res = matrix[n-1][i];
            }
        }
        //return res;
        System.out.println(res);
    }
}
