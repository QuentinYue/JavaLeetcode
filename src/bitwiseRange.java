public class bitwiseRange {
    public static void main(String[] args){
        int i = 1;
        System.out.println(i);
    }
}

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left == 0 || right == 0){
            return 0;
        }
        int count = 0;
        int res = 0;
        while(left>=1 && right>=1){
            if(left == right){
                left = left << count;//finally does left shift 'count' bit
                res = left;
                break;
            }
            left = left >> 1; //keep doing right shift til left == right
            right = right >> 1;
            count++;
        }
        return res;
    }
}
