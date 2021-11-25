//S1:
class Solution {
    public int searchInsert(int[] nums, int target) {
        int r = nums.length - 1;
        int l = 0;
        while(l <= r){
            int m = (l+r)/2;
            if(nums[m] == target){
                return m;
            }
            if(nums[m] > target){
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        return l;
    }
}

//S2:
class Solution {
    public int searchInsert(int[] nums, int target) {
        int r = nums.length - 1;
        int l = 0;
        while(l <= r){
            int mid = (r-l) / 2 + l;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                if(mid != 0 && nums[mid-1] < target){
                    return mid;
                }
                if(mid == 0){
                    return 0;
                }
                r = mid;
            }
            else{ // less than target
                if(mid != nums.length - 1 && nums[mid+1] > target){
                    return mid+1;
                }
                if(mid == nums.length-1){
                    return nums.length;
                }
                l = mid + 1;
            }
        }
        return l;
    }
}