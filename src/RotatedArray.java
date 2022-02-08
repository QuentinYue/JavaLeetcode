import java.util.Arrays;
import java.util.stream.IntStream;

public class RotatedArray {
    public static void main(String[] args){

        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        //二分
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid = (r-l)/2 + l;
            if(nums[mid] == target){
                //return mid;
                System.out.println(mid);
                System.exit(0);
            }
            if(nums[mid] > nums[l]){ //左侧有序(包括 mid)
                if(target >= nums[l] && target < nums[mid]){
                    r = mid;
                }
                else{
                    l = mid + 1;
                }
            }
            else{//右侧有序(不包含 mid)
                //注意 [mid+1]
                if(target >= nums[mid+1] && target <= nums[r]){
                    l = mid + 1;
                }
                else{
                    r = mid;
                }
            }
        }
        //return nums[l] == target?l:-1;
        System.out.println(nums[l] == target?l:-1);
    }
}

/*
石 2, easier to understand:
class Solution {
    public int search(int[] nums, int t) {
        //二分
        int l = 0;
        int r = nums.length-1;
        while(l<=r){
            int m = l + (r-l)/2;
            if(nums[m] == t){
                return m;
            }
            if(nums[m] >= nums[l]){ //必须加等于号
                if(nums[l] <= t && t < nums[m]){
                    r = m - 1;
                }
                else{
                    l = m + 1;
                }
            }
            else{
                if(nums[m] < t && t <= nums[r]){
                    l = m + 1;
                }
                else{
                    r = m - 1;
                }
            }
        }
        return -1;
    }
}
 */
