/*
public class moveZeroes {
    public static void main(String[] args){
        int len = nums.length;
        int slow = 0; //快慢指针
        int fast = 0;
        while(fast < len){
            if(nums[fast] != 0){
                nums[slow] = nums[fast];
                slow += 1;
            }
            fast += 1;
        }
        for(int i = slow; i < len; i++){
            nums[i] = 0;//slow及之后全赋值为 0
        }
    }
}
*/