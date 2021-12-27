/*
package MajorityNumber2T;

public class Mn229 {
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        int t = nums.length/3;
        int num1 = 0;
        int num2 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i:nums){
            if(count1>0 && count2>0){
                if(i == num1){
                    count1++;
                }
                else if(i == num2){
                    count2++;
                }
                else{
                    count1--;
                    count2--;
                }
            }
            else if(count1 > 0){
                if(i == num1){
                    count1++;
                }
                else{
                    num2 = i;
                    count2++;//let it be 1 (greater than 0)
                }
            }
            else if(count2 > 0){
                if(i == num2){
                    count2++;
                }
                else{
                    num1 = i;
                    count1++;//let it be 1 (greater than 0)
                }
            }
            else{// both < 0, then assign i to num1
                num1 = i;
                count1++;//let it be 1 (greater than 0)
            }
        }
        //check num1 & num2 through iterations
        count1 = 0;
        count2 = 0;
        for(int i:nums){
            if(i == num1){
                count1++;
            }
        }
        for(int i:nums){
            if(i == num2){
                count2++;
            }
        }
        if(count1 > t){
            res.add(num1);
        }
        if(count2 > t && num1 != num2){
            res.add(num2);
        }
        return res;
    }
}

 */
