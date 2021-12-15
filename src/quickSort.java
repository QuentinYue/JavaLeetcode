public class quickSort {
    public static void main(String[] args) {
        int[] nums = {5, 1, 1, 2, 0, 0};
        if (nums == null || nums.length == 0){

        }
            //return nums;
        quickSort(nums, 0, nums.length - 1);
       // return nums;
        for(int x:nums){
            System.out.println(x);
        }
    }

    public static void quickSort(int[] nums, int l, int r) {
        if (l >= r) return;
        int mid = partition(nums, l, r);
        quickSort(nums, l, mid-1);
        quickSort(nums, mid+1, r);
    }

    public static int partition(int[] nums, int l, int r) {
        int pivot = nums[l];
        while (l < r) {
            while (l < r && nums[r] > pivot) {
                r--;
            }
            if(l < r) {
                nums[l] = nums[r];
                l++;
            }
            while (l < r && nums[l] < pivot) {
                l++;
            }
            if(l < r) {
                nums[r] = nums[l];
                r--;
            }
        }
        nums[l] = pivot;
        return l;
    }
}
