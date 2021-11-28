public class climbingStairs_70 {
    public static void main(String[] args){
        int n = 3;
        if(n <= 1){
            //return 1;
        }
        int dp1 = 1;
        int dp2 = 2;
        for(int i=3; i<=n; i++){
            int v = dp1 + dp2;
            dp1 = dp2;
            dp2 = v;
        }
        //return dp2;
    }
}
