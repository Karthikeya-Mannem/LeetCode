class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int add = 0;
        for(int i = 0;i<nums.length;i++){
            add = add+nums[i];
        }
        return sum-add;
    }
}