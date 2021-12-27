/*
class Solution {
    public int rangeBitwiseAnd(int left, int right) {

        if(Integer.toBinaryString(left).length() != Integer.toBinaryString(right).length()){
            return 0;
        }
        int count = 0;
        while(left != right){
            left >>= 1;
            right >>= 1;
            count++;
        }
        return left << count;
    }
}

 */