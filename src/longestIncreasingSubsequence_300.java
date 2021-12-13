public class longestIncreasingSubsequence_300 {
    public static void main(String[] args){

    }
}

/*
//Method0:
//DP O(n^2)
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        //initial with 1
        for(int i=0; i<nums.length; i++){
            dp[i] = 1;
        }
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        //find MAX
        int max = 0;
        for(int i=0; i<dp.length; i++){
            if(dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
}

//优化:长度相同情况下,最后一个数字越小越好
//Method1:
 //耐心排序法
  class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int len = 0;
        for (int i = 1; i < nums.length; i++) {
            int pos = bSearch(dp,len,nums[i]);
            if (nums[i] < dp[pos]) dp[pos] = nums[i];
            if (pos > len) {
                len = pos;
                dp[len] = nums[i];
            }
        }
        return len+1; // len is the index, so have to be added 1
    }

    private int bSearch(int[] arr, int len, int val){
        int l = 0;
        int r = len;
        while(r-l > 1){
            int m = l + (r - l) / 2;
            if(arr[m] == val){
                return m;
            }
            else if(arr[m] < val){
                l = m;
            }
            else{
                r = m;
            }
        }
        if(arr[r] < val){
            return len + 1;
        }
        else if(arr[l] >= val){
            return l;
        }
        else{
            return r;
        }
    }
}
 */