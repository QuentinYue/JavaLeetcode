public class EqualsK560 {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int k=3;
        int res = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    res++;
                }
            }
        }
        System.out.println(res);
        //return res;
    }
}
