import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class LC01_3Sum02 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res  = new HashSet<>();

        if(nums.length == 0){
            return new ArrayList<>(res);
        }

        //Arrays.sort(nums);   //关键在此!!!!
        for(int i=0; i<nums.length-3; i++){
            for(int j=i+1; j<nums.length-1; j++){
                int sum = nums[i] + nums[j] + nums[j+1];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[j], nums[j+1]));
                }
            }
        }
        return new ArrayList<>(res);
    }

    public static void main(String[] args){
        int[] a = {-1,0,1,2,-1,-4};
        List<List<Integer>> a1 = new ArrayList<>();
        a1 = threeSum(a);
        for(List i : a1){
            System.out.println(i);
        }
        System.out.println(a1.size());
    }
}
