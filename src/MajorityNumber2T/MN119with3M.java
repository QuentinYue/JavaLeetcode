/*
package MajorityNumber2T;

//妙 0:
//最优解法,直接返回数组中出现最多次的数
//Boyer-Moore Voting Algorithm
class Solution{
    public int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 0;
        for(int i:nums){
            if(count == 0){
                res = i;
            }
            if(i == res){
                count++;
            }
            else{
                count--;
            }
        }
        return res;
    }
}

//妙 1:
//The majority element appears more than n/2 times, which means it must show in the nums.length position of the sorted array, whether the index is odd or even
class Solution{
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

//土法(HashMap):
class Solution {
    public int majorityElement(int[] nums) {
        int res=0;
        int t = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i) > t){
                res = i;
            }
        }
        return res;
    }
}

 */
